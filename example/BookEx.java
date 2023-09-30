import java.util.Scanner;

public class BookEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finalCharge = sc.nextInt();
        int[] charges = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            charges[i] = sc.nextInt();
            sum += charges[i];
        }
        System.out.println(finalCharge - sum);
    }
}
