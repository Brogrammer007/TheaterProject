package repositories;

import models.Predstava;

import java.util.ArrayList;

public class Repository {
    TheatherFileHandler fileHandler;

    public static ArrayList<Predstava> predstave;

    public Repository(TheatherFileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public void readDatabase() {
        this.predstave =  this.fileHandler.readPredstavaFromFile();
    }


    public void writeDatabase() {
        this.fileHandler.writePredstavaToFile(this.predstave);
    }
}
