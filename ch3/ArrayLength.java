import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.");
		int Array[] = new int[5];
		
		double sum= 0.0;
		for(int i=0; i < Array.length; i++)
			Array[i]= scanner.nextInt();
		
		for(int i=0; i<Array.length; i++)
			sum += Array[i];
		
		System.out.print("평균은" + sum/Array.length);
		scanner.close();
		
	}

}
