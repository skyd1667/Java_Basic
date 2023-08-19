import java.util.Scanner;

public class Binomial {
    public static int factorial(int x) {
        int starter = 1;
        for (int i = 1; i < x + 1; i++) {
            starter *= i;
        }
        return starter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerat = sc.nextInt();
        int denom = sc.nextInt();
        int denomB = numerat - denom;
        int binomial = factorial(numerat) / (factorial(denom) * factorial(denomB));
        System.out.println(binomial);
    }
}
