import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Read {
    String filePath = "C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheatarProjectApp\\TheaterProject\\resources\\read.txt";

    Path path = Paths.get(filePath);

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }


    public Read() throws FileNotFoundException {
    }
}
