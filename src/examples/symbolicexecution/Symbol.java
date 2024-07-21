public class Symbol extends Expr {
    String name;

    public Symbol(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }
}
