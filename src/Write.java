import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write  {
    public static void writePredstavaToFile(String filePathWrite,ArrayList<Predstava> listaPredstava) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathWrite))){
            for (Predstava p : listaPredstava){
                writer.write(p.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}