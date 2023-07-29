import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];
        try {
            FileInputStream fin = new FileInputStream("c:\\test.out");
            int n = 0;
            white ((c = fin.read()) != -1) {
                b[n] = (byte)c;
                n++;
            }
            
            System.out.println("Outputting read arrays from c:\\test.out");
            for (int i = 0; i < b.length; i++) {
                System.out.println();
            }
            
            fin.close();
        } catch(IOException e) {}
    }
}
