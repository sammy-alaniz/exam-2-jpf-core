public class IntegerConstraintExample {
    public static void main(String[] a) {
        String x = "X";
        String y = "Y";
        String z = "Z";

        AdditionExpression ae1 = new AdditionExpression(x, y);
        AdditionExpression ae2 = new AdditionExpression(y, z);

        CandidateSolution sol = new CandidateSolution();
        sol.set(x, 1);
        sol.set(y, 2);
        sol.set(z, 3);

        System.out.println(ae1.evaluate(sol));
        System.out.println(ae2.evaluate(sol));

        EqualityConstraint eq1 = new EqualityConstraint(ae1, ae2);
        System.out.println(eq1.evaluate(sol));
    }
}
