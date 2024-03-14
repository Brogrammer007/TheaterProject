package repositories;

import com.google.gson.JsonArray;
import models.Predstava;
import models.TipPredstave;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import models.Users;


public class TheatherFileHandler {
    private String predstavePath;
    private String bazaPath;

    public TheatherFileHandler(String predstavePath, String bazaPath) {
        this.predstavePath = predstavePath;
        this.bazaPath = bazaPath;
    }

    public void writePredstavaToFile(ArrayList<Predstava> listaPredstava) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.predstavePath))) {
            for (Object o : listaPredstava) {
                writer.write(o.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public ArrayList<Predstava> readPredstavaFromFile() {
        String filePath = this.predstavePath;
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

                    // Create a models.Predstava object using the read data
                    predstava = new Predstava(id, naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis);
                    predstaveIzReadera.add(predstava);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return predstaveIzReadera;
    }

    public void writePredstavaToJson(ArrayList<Predstava> listaPredstava) {
        try (BufferedReader reader = new BufferedReader(new FileReader(bazaPath))) {
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(reader, JsonObject.class);

            for (Predstava o : listaPredstava) {
                JsonObject predstave = new JsonObject();
                predstave.addProperty("id:", o.getId());
                predstave.addProperty("naziv:", o.getNaziv());
                predstave.addProperty("tip:", o.getTipPredstave().toString());
                predstave.addProperty("reziser:", o.getReziser());
                JsonArray glumci = new JsonArray();
                for (String g : o.getGlumci())
                    glumci.add(g);
                predstave.add("glumci:", glumci);
                predstave.addProperty("trajanje:", o.getTrajanje());
                predstave.addProperty("produkcija:", o.getProdukcija());
                predstave.addProperty("godina", o.getGodina());
                predstave.addProperty("opis:", o.getOpis());

                json.getAsJsonArray("predstave").add(predstave);
            }

            try (FileWriter writer = new FileWriter(bazaPath)) {
                gson.toJson(json, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Predstava> readPredstavaFromJson() {
        ArrayList<Predstava> predstaveIzReadera = new ArrayList<>();
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(bazaPath))) {
            JsonObject json = gson.fromJson(reader, JsonObject.class);
            json.getAsJsonArray("predstave").forEach(predstava -> {
                JsonObject jsonPredstava = predstava.getAsJsonObject();
                String naziv = jsonPredstava.get("naziv:").getAsString();
                TipPredstave tip = TipPredstave.valueOf(jsonPredstava.get("tip:").getAsString());
                String reziser = jsonPredstava.get("reziser:").getAsString();
                JsonArray glumciJsonArray = jsonPredstava.getAsJsonArray("glumci:");
                ArrayList<String> glumci = new ArrayList<>();
                glumciJsonArray.forEach(glumac -> glumci.add(glumac.getAsString()));
                int trajanje = jsonPredstava.get("trajanje:").getAsInt();
                String produkcija = jsonPredstava.get("produkcija:").getAsString();
                int godina = jsonPredstava.get("godina").getAsInt();
                String opis = jsonPredstava.get("opis:").getAsString();

                Predstava novaPredstava = new Predstava(naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis);
                predstaveIzReadera.add(novaPredstava);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return predstaveIzReadera;
    }

    public ArrayList<Users> readKorisniciFromJson() {
        Gson gson = new Gson();
        ArrayList<Users> korisnici = new ArrayList<Users>();
        try (BufferedReader reader = new BufferedReader(new FileReader(bazaPath))) {
            JsonObject json = gson.fromJson(reader, JsonObject.class);
            json.getAsJsonArray("korisnici").forEach(korisnik -> {
                JsonObject jsonPredstava = korisnik.getAsJsonObject();
                String username = jsonPredstava.get("username").getAsString();
                String password = jsonPredstava.get("password").getAsString();
                int dozvola = jsonPredstava.get("dozvola").getAsInt();

                Users user = new Users(username, password, dozvola);
                korisnici.add(user);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return korisnici;
    }

    public void writeKorisnikToJson(Users korisnik) {
        try (BufferedReader reader = new BufferedReader(new FileReader(bazaPath))) {
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(reader, JsonObject.class);

            JsonObject JSONkorisnik = new JsonObject();
            JSONkorisnik.addProperty("username", korisnik.getUsername());
            JSONkorisnik.addProperty("password", korisnik.getPassword());
            JSONkorisnik.addProperty("dozvola", korisnik.getDozvole());

            json.getAsJsonArray("korisnici").add(JSONkorisnik);

            try (FileWriter writer = new FileWriter(bazaPath)) {
                gson.toJson(json, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int checkLoginFromJson(Users glava) {
        Gson gson = new Gson();
        int povratak =  -1;
        try (BufferedReader reader = new BufferedReader(new FileReader(bazaPath))) {
            JsonObject json = gson.fromJson(reader, JsonObject.class);
            JsonArray korisnici = json.getAsJsonArray("korisnici");
            for (var element : korisnici) {
                JsonObject korisnik = element.getAsJsonObject();
                String user = korisnik.get("username").getAsString();
                String pass = korisnik.get("password").getAsString();
                int dozvola = korisnik.get("dozvola").getAsInt();
                if (glava.getUsername().equals(user) && glava.getPassword().equals(pass)) {
                    return dozvola;
                } else if(glava.getUsername().equals(user)) povratak++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return povratak;
    }
}
        