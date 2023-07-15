import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        
        v.add(2, 100);
        System.out.println("Num of elements in vector: " + v.size());
        System.out.println("Current space in vector: " + v.capacity());
        
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }
    }
}
