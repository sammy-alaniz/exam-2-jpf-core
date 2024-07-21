public class EqualityConstraint extends IntegerConstraint {
    IntegerExpression lhs, rhs;

    EqualityConstraint(IntegerExpression l, IntegerExpression r) {
        lhs = l;
        rhs = r;
    }

    boolean evaluate(CandidateSolution sol) {
        return lhs.evaluate(sol) == rhs.evaluate(sol);
    }
}
