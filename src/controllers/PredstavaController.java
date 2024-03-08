package controllers;

import models.Predstava;
import services.PredstavaService;
import views.PredstavaView;

import java.util.ArrayList;

public class PredstavaController {
    public static void dodajPredstavu(){
        Predstava newPredstava = PredstavaView.createPredstava();
        PredstavaService.createPredstava(newPredstava);
    }

    public static void sortPredstavaById(){
        ArrayList<Predstava> predstave = PredstavaService.sortById();
        PredstavaView.printPredstave(predstave);
    }
}
