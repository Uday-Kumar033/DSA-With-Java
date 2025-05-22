import java.io.FileWriter;
import java.io.IOException;
public class readtxt {
    public static void main(String[] args) throws IOException {
        // FileReader s = new FileReader("a.txt");
        // s.read();
        // System.out.println(s.read());

        //File writing
        FileWriter s = new FileWriter("a.txt");
        s.write("Hello This is a write file");
        s.close();
    }
}
