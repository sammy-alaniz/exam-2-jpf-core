public abstract class Constraint {
    Expr l, r;

    Constraint(Expr l, Expr r) {
        this.l = l;
        this.r = r;
    }
}
