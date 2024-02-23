import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
    String filePath;
    public static Predstava readPredstavaFromFile(String filePath) {
        Predstava predstava = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            if (line != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 9) {
                    int id = Integer.parseInt(parts[0]);  // Parse the first part as an integer
                    String naziv = parts[1];
                    TipPredstave tip = TipPredstave.valueOf(parts[2]);
                    String reziser = parts[3];
                    String[] glumciArray = parts[4].substring(1, parts[4].length() - 1).split(", ");
                    ArrayList<String> glumci = new ArrayList<>();
                    for (String glumac : glumciArray) {
                        glumci.add(glumac);
                    }
                    int trajanje = Integer.parseInt(parts[5]);  // Corrected index for duration
                    String produkcija = parts[6];
                    int godina = Integer.parseInt(parts[7]);
                    String opis = parts[8];  // Corrected index for description

                    // Create a Predstava object using the read data
                    predstava = new Predstava(id, naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return predstava;
    }
}

