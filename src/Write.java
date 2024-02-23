import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write  {
    String filePath;

    public static Predstava writePredstavaToFile(String filePath) {
         





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

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(
                    predstava.getId()+"|"+
                            predstava.getNaziv() + "|" +
                            predstava.getTipPredstave() + "|" +
                            predstava.getReziser() + "|" +
                            predstava.getGlumci() + "|" +
                            predstava.getTrajanje() + "|" +
                            predstava.getProdukcija() + "|" +
                            predstava.getGodina() + "|" +
                            predstava.getOpis()) ;
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return predstava;
    }
}