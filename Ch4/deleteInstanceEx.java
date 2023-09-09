public class deleteInstanceEx {
    public static String deleteInstances(String word, String inst) {
        return word.replace(inst, "");
    }
    public static void main(String[] args) {
        String word = "peeler";
        String instance = "e";
        System.out.println(instance + " removed from " + word + " is " + deleteInstances(word, instance));
    }
}
