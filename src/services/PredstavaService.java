package services;

import models.Predstava;
import models.TipPredstave;
import repositories.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PredstavaService {
    public static void createPredstava(Predstava predstavaInput) {
        int id = Repository.predstave.size() + 1;
        Predstava predstava = new Predstava(id, predstavaInput);
        // Repository.addPrestava(predstava);
        Repository.predstave.add(predstava);
    }

    public static ArrayList<Predstava> sortById() {
        Collections.sort(Repository.predstave, Comparator.comparingInt(Predstava::getId));
        return Repository.predstave;
    }
}
