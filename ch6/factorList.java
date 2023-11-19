import java.util.*;

public class factorsList {
    public static void main(String[] args) {
        int tester = 2400;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= tester; i++) {
            if (tester % i == 0)
                arr.add(i);
        }
        System.out.println(arr.toString());
    }
}
