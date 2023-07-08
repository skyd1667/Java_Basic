import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query, "&");
        
        int n = st.countTokens();
        System.out.println("Number of tokens = " + n);
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
