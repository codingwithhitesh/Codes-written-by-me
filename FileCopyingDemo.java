import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyingDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\Hitesh\\Documents\\Source.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Hitesh\\Documents\\Destination.txt");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
