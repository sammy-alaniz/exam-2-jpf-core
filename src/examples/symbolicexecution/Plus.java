public class Plus extends Expr {
    Expr l, r;

    public Plus(Expr l, Expr r) {
        this.l = l;
        this.r = r;
    }

    public String toString() {
        return "(" + l + " + " + r + ")";
    }
}
