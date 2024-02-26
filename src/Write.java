import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write  {
    String filePath;
    public static ArrayList<Predstava> predstavaList = new ArrayList<>();

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
    public static void writePredstavafromRead(String path, ArrayList<Predstava> listaPredstava){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for (Predstava p: listaPredstava){
                writer.write(p.toString());
                writer.newLine();}

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}