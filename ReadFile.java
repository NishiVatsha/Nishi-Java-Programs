// 21. File Handling Programs 

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("test.txt");
            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
