import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        String filePath = "resources/write.txt";

        Predstava predstava1 = new Predstava("BangBros", TipPredstave.DRAMA, "Vuk", new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),300, "Nebitno", 2023, "Ozbiljna prica");

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(predstava1.getNaziv() + "\n" + predstava1.getOpis() + "\n" + predstava1.getGodina() + "\n" + predstava1.getProdukcija() + "\n" + predstava1.getTipPredstave() + "\n" + predstava1.getGlumci());
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}