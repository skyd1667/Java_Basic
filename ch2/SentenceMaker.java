public class SentenceMaker {
    public static void main(String[] args) {
        String first = "The sum of ";
        int fs = 100;
        int sc = 200;
        String mid = " and ";
        String end = " is ";
        String sentence = first + fs + mid + sc + end + (fs + sc);
        System.out.println(sentence);
    }
}
