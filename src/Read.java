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
    public static Predstava readPredstavaFromFile(String filePath) {

        Predstava predstava = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            if (line != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 8) {
                    String naziv = parts[0];
                    TipPredstave tip = TipPredstave.valueOf(parts[1]);
                    String reziser = parts[2];
                    String[] glumciArray = parts[3].substring(1, parts[3].length() - 1).split(", ");
                    ArrayList<String> glumci = new ArrayList<>();
                    for (String glumac : glumciArray) {
                        glumci.add(glumac);
                    }
                    int trajanje = Integer.parseInt(parts[4]);
                    String produkcija = parts[5];
                    int godina = Integer.parseInt(parts[6]);
                    String opis = parts[7];

                    // Create a Predstava object using the read data
                    predstava = new Predstava(naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return predstava;
    }

    // ... existing code ...
}
