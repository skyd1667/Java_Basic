import java.util.*;

public class VectorToArray {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            v.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = v.get(i);
        }
    }
}
