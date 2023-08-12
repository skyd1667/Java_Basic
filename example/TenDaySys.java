import java.util.Scanner;

public class TenDaySys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int carA = sc.nextInt();
        int carB = sc.nextInt();
        int carC = sc.nextInt();
        int carD = sc.nextInt();
        int carE = sc.nextInt();
        int[] cars = {0, 0, 0, 0, 0};
        cars[0] = carA;
        cars[1] = carB;
        cars[2] = carC;
        cars[3] = carD;
        cars[4] = carE;
        int illegal = 0;
        for (int i = 0; i < 5; i++) {
            if (cars[i] == date) {
                illegal += 1;
            }
        }
        System.out.println(illegal);
    }
}
