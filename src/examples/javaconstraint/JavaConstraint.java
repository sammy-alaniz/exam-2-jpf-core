import gov.nasa.jpf.vm.Verify;

public class JavaConstraint {
    int x = 0, y = 0, z = 0;

    boolean constraint() {
        return x < y + 1 && y <= x + z && x * y > z;
    }

    public String toString() {
        return "x=" + x + ", y=" + y + ", z=" + z;
    }

    public static void main(String[] args) {
        Verify.resetCounter(0); // non-solution count
        Verify.resetCounter(1); // solution count

        // assume: each variable has value >= lower and <= upper
        int lower = -1;
        int upper = 2;

        JavaConstraint jc = new JavaConstraint();
        // System.out.println(jc.constraint());

        jc.x = Verify.getInt(lower, upper);
        jc.y = Verify.getInt(lower, upper);
        jc.z = Verify.getInt(lower, upper);

        System.out.print("candidate: " + jc);
        if (jc.constraint()) {
            System.out.println(" **** SOLUTION ****");
            Verify.incrementCounter(1);
        } else {
            System.out.println();
            Verify.incrementCounter(0);
        }

        System.out.println("sol-count: " + Verify.getCounter(1));
        System.out.println("non-sol-count: " + Verify.getCounter(0));
        System.out.println();
    }
}
