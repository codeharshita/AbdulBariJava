import java.io.*;

public class ExceptionHandling {

    public static void findFile() throws IOException {
        File newFile = new File("TextNew.txt");
        FileInputStream stream = new FileInputStream(newFile);

    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);

        }

    }
}
