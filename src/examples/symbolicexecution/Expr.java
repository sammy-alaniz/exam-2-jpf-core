import java.util.LinkedList;

import gov.nasa.jpf.vm.Verify;

public abstract class Expr {
    static LinkedList<Constraint> pc = new LinkedList<>();

    public Expr plus(Expr e) {
        return new Plus(this, e);
    }

    public Expr minus(Expr e) {
        return new Minus(this, e);
    }

    public boolean gt(Expr e) {
        boolean result = Verify.getBoolean();
        if (result) {
            pc.add(new GT(this, e));
        } else {
            pc.add(new LE(this, e));
        }
        return result;
    }
}
