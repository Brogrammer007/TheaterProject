import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Read {

    String filePath;

    ArrayList<Predstava> predstaveIzReadera = new ArrayList<>();
    public static Predstava readPredstavaFromFile(String filePath) {

        Predstava predstava = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            if (line != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 9) {
                    int id = Integer.parseInt(parts[0]);
                    String naziv = parts[1];
                    TipPredstave tip = TipPredstave.valueOf(parts[2]);
                    String reziser = parts[3];
                    String[] glumciArray = parts[4].substring(1, parts[4].length() - 1).split(", ");
                    ArrayList<String> glumci = new ArrayList<>();
                    for (String glumac : glumciArray) {
                        glumci.add(glumac);
                    }
                    int trajanje = Integer.parseInt(parts[5]);
                    String produkcija = parts[6];
                    int godina = Integer.parseInt(parts[7]);
                    String opis = parts[8];

                    // Create a Predstava object using the read data
                    predstava = new Predstava(id,naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return predstava;
    }

    // ... existing code ...
}
