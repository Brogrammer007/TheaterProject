import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write  {
    String filePath;
    public static ArrayList<Predstava> predstavaList = new ArrayList<>();

    public static Predstava writePredstavaToFile(String filePathWrite) {


        Predstava predstava = new Predstava(
                0,
                "BangBros",
                TipPredstave.DRAMA,
                "Vuk",
                new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),
                300,
                "Nebitno",
                2023,
                "Ozbiljna prica");

        Predstava predstava1 = new Predstava(
                0,
                "BangBros",
                TipPredstave.DRAMA,
                "Vuk",
                new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),
                300,
                "Nebitno",
                2023,
                "Ozbiljna prica");
        predstavaList.add(predstava);
        predstavaList.add(predstava1);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathWrite))){
            for (Predstava p : predstavaList){
                writer.write(p.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return predstava;
    }
}