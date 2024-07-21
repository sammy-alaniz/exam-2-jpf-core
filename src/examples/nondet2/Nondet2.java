import gov.nasa.jpf.vm.Verify;

public class Nondet2 {
    int v = 0;

    void m1() { v++; }
    void m2() { v--; }

    static void generate2() {
        StringBuilder sb = new StringBuilder();
        sb.append("public void testID {\n");
        sb.append("    Nondet2 o = new Nondet2();\n");
        int length = Verify.getInt(0, 2);
        for (int i = 0; i < length; i++) {
            int method = Verify.getInt(1, 2);
            if (method == 1) {
                sb.append("    o.m1();\n");
            }
            if (method == 2) {
                sb.append("    o.m2();\n");
            }
        }
        sb.append("}\n");
        int id = Verify.getCounter(1);
        sb.replace(16, 18, id + "");
        System.out.println(sb);
        Verify.incrementCounter(1);
    }

    static void generate() {
        int length = Verify.getInt(0, 2);
        Nondet2 o = new Nondet2();
        for (int i = 0; i < length; i++) {
            int method = Verify.getInt(1, 2);
            if (method == 1) {
                o.m1();
            }
            if (method == 2) {
                o.m2();
            }
        }
//        assert o.v >= -2;
    }

    public static void main(String[] a) {
        Verify.resetCounter(1);
        generate2();
//        System.out.println(Verify.getInt(0, 3));
    }
}
