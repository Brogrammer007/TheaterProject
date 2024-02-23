import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write {
    String filePath;
    public static ArrayList<Predstava> predstavaList = new ArrayList<>();
    public static Predstava writePredstavaToFile(String filePath) {


        Predstava predstava = new Predstava(1, "BangBros", TipPredstave.DRAMA, "Vuk", new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),300, "Nebitno", 2023, "Ozbiljna prica");
        Predstava predstava2 = new Predstava(1, "BangBros", TipPredstave.DRAMA, "Vuk", new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),300, "Nebitno", 2023, "Ozbiljna prica");
        Predstava predstava3 = new Predstava(1, "BangBros", TipPredstave.DRAMA, "Vuk", new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),300, "Nebitno", 2023, "Ozbiljna prica");

        predstavaList.add(predstava);
        predstavaList.add(predstava2);
        predstavaList.add(predstava3);




        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Predstava p : predstavaList) {
                writer.write(p.toString());
                writer.newLine();
            }
            System.out.println("Details written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return predstava;
    }
}
