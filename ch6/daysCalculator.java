import java.util.Scanner;

public class daysCalculator {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int totalDist = 0;
          int runningDist = sc.nextInt();
          int fallingDist = sc.nextInt();
          int finalDist = sc.nextInt();
          int days = 0;
          while (totalDist < finalDist) {
               days += 1;
               totalDist += runningDist;
               if (totalDist >= finalDist ) {
                    break;
               }
               else {
                    totalDist -= fallingDist;
               }
          }
          System.out.println(days);
     }
}