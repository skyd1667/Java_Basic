import java.util.Scanner;

public class AvgGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grades[] = {0, 0, 0, 0, 0};
        grades[0] = sc.nextInt();
        grades[1] = sc.nextInt();
        grades[2] = sc.nextInt();
        grades[3] = sc.nextInt();
        grades[4] = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (grades[i] < 40) {
                grades[i] = 40;
            }
        }
        int averageGrade = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
        System.out.print(averageGrade);
    }
}
