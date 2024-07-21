import gov.nasa.jpf.vm.Verify;

import java.util.HashSet;
import java.util.Set;

public class IntegerConstraintSolver {
    static void solve(IntegerConstraint ic, Set<String> vars) {
        // assume: each variable has value -2, -1, 0, 1, or 2

        Verify.resetCounter(0);

        CandidateSolution sol = new CandidateSolution();
        for (String v: vars) {
            sol.set(v, Verify.getInt(-2, 2));
        }

        if (ic.evaluate(sol)) {
            System.out.println("SOLUTION #" + Verify.getCounter(0) + ": " + 
                sol.candidate);
            Verify.incrementCounter(0);
        }
        
        if (Verify.getCounter(0) > 5) {
            Verify.terminateSearch();
        }
    }

    public static void main(String[] args) {
        // x + y == u + v
        AdditionExpression ae1 = new AdditionExpression("x", "y");
        AdditionExpression ae2 = new AdditionExpression("u", "v");

        EqualityConstraint eq = new EqualityConstraint(ae1, ae2);

        Set<String> vars = new HashSet<>();
        vars.add("x");
        vars.add("y");
        vars.add("u");
        vars.add("v");

        solve(eq, vars);
    }
}
