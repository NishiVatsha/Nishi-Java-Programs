// 21.  File Handling Programs 

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello, this is a file handling program.\n");
            fw.write("We are writing data into the file.");
            fw.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
