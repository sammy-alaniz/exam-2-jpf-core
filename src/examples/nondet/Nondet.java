import java.util.Arrays;

import gov.nasa.jpf.vm.Verify;

public class Nondet {
    public static void main(String[] a) {
        int x = Verify.getInt(0, 2);
        // String[] vals = new String[]{"hello", "world", "hi", "bye"};
        // boolean b = Verify.getBoolean();
        // System.out.println(x + ", " + b);
        // x = x + 1;
        // System.out.println(x);
        // op(vals[x]);
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Verify.getInt(0, arr.length);
        }
        m(arr);
    }

    static void p(Object o) {
        
    }

    static void m(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void op(String s) {
        System.out.println(s);
    }
}
