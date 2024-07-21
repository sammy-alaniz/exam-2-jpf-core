public class AdditionExpression extends IntegerExpression {
    String lhs, rhs;

    AdditionExpression(String l, String r) {
        lhs = l;
        rhs = r;
    }

    int evaluate(CandidateSolution sol) {
        return sol.candidate.get(lhs) + sol.candidate.get(rhs);
    }
}
