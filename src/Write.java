import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write {
    String filePath;
    public static Predstava writePredstavaToFile(String filePath) {
        Predstava predstava = new Predstava("BangBros", TipPredstave.DRAMA, "Vuk", new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),300, "Nebitno", 2023, "Ozbiljna prica");

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(predstava.getNaziv() + "\n" + predstava.getTipPredstave() + "\n" + predstava.getReziser() + "\n" + predstava.getGlumci() + "\n" + predstava.getTrajanje() + "\n" + predstava.getProdukcija() + "\n" + predstava.getGodina() + "\n" + predstava.getOpis());
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return predstava;
    }
}
