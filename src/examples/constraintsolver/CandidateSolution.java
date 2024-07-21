import java.util.Map;
import java.util.HashMap;

public class CandidateSolution {
    Map<String, Integer> candidate = new HashMap<>();

    void set(String var, int val) {
        candidate.put(var, val);
    }

    int value(String var) {
        return candidate.get(var);
    }

    public String toString() {
        return candidate.toString();
    }
}
