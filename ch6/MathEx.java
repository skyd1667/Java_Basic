public class MathEx {
    public static void main (String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.sqrt(9.0));
        System.out.println(Math.exp(2));
        System.out.println(Math.round(3.14));
        
        System.out.println("The lucky number of the week is ");
        for (int i = 0; i < 5; i++) {
            System.out.println((int)(Math.random() * 45 + 1) + " ");
        }
    }
}
