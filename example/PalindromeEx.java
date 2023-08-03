import java.util.Scanner;

public class PalindromeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        int stringSize = word.length();
        boolean isOrg = false;
        for (int i = 0; i < Math.round(stringSize); i++) {
            if (word.charAt(i) == word.charAt((stringSize - 1) - i)) {
                isOrg = false;
            }
            else {
                isOrg = true;
            }
            if (isOrg) break;
        }
        if (!isOrg) System.out.println(1);
        else System.out.println(0);
    }
}
