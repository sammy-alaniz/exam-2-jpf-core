public class Minus extends Expr {
    Expr l, r;

    public Minus(Expr l, Expr r) {
        this.l = l;
        this.r = r;
    }

    public String toString() {
        return "(" + l + " - " + r + ")";
    }

}
