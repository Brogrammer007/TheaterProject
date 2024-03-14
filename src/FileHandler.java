import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler  {
    public static void writePredstavaToFile(String filePathWrite ,ArrayList<Predstava> listaPredstava) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathWrite))){
            for (Predstava p : listaPredstava){
                writer.write(p.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Predstava> readPredstavaFromFile(String filePath) {
        ArrayList<Predstava> predstaveIzReadera = new ArrayList<>();
        Predstava predstava;
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
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
                    predstava = new Predstava(id, naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis);
                    predstaveIzReadera.add(predstava);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return predstaveIzReadera;
    }
}