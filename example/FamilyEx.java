import java.util.Scanner;

public class FamilyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int youngest = sc.nextInt();
        int middle = sc.nextInt();
        int diff = middle - youngest;
        int oldest = middle + diff;
        System.out.println(oldest);
    }
}
