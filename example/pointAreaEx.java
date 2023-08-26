import java.util.Scanner;

public class pointAreaEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pointCount = sc.nextInt();
        int[] pointsX = new int[pointCount];
        int[] pointsY = new int[pointCount];
        for (int i = 0; i < pointCount; i++) {
            pointsX[i] = sc.nextInt();
            pointsY[i] = sc.nextInt();
        }
        int top = pointsY[0];
        int right = pointsX[0];
        int left = pointsX[0];
        int bottom = pointsY[0];
        for (int i = 0; i < pointCount; i++) {
            if (pointsY[i] > top) top = pointsY[i];
            if (pointsX[i] > right) right = pointsX[i];
        }
        for (int i = 0; i < pointCount; i++) {
            if (pointsY[i] < bottom) bottom = pointsY[i];
            if (pointsX[i] < left) left = pointsX[i];
        }
        int height = Math.abs(top - bottom);
        int width = Math.abs(left - right);
        System.out.println(height * width);
    }
}
