public class SymbolicExecutionExample {

    static void m(int x, int y) {
        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
            if (x - y > 0) {
                assert false;
            }
        }
    }

    static void mS(Expr x, Expr y) {
        if (x.gt(y)) {
            x = x.plus(y);
            y = x.minus(y);
            x = x.minus(y);
            if (x.minus(y).gt(new Constant(0))) {
                assert false;
            }
        }
    }

    public static void main(String[] a) {
//        m(0, 1);
        mS(new Symbol("X"), new Symbol("Y"));
        System.out.println(Expr.pc);
    }

}
