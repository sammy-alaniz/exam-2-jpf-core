public class Constant extends Expr {
    int val;

    public Constant(int v) {
        val = v;
    }

    public String toString() {
        return Integer.toString(val);
    }
}
