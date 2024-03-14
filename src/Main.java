import controllers.PredstavaController;
import models.Predstava;
import models.Users;
import repositories.Repository;
import repositories.TheatherFileHandler;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Repository repository = new Repository(
            new TheatherFileHandler("C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheaterProject\\resources\\predstave.txt",
                    "C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheaterProject\\resources\\baza.json")
    );

    public static void main(String[] args) {

        repository.readDatabase();

        try {
//            Scanner scanner = new Scanner(System.in);
//
//            int unos = 1;
//            while (unos == 1) {
//                System.out.println("Da li zelite da unesete novu predstavu:(1 - Da, 2 - Ne)");
//                unos = Integer.parseInt(scanner.nextLine());
//                while (unos == 1) {
//
//                    // 1 dodaj predstavu
//                    // 2 iscitaj predstave
//                    // 3 sortiraj
//                    // 4 obrisij
//
//
//                    PredstavaController.dodajPredstavu();
//
//                    System.out.println("Da li zelite da unesete novu predstavu:(1 - Da, 2 - Ne)");
//                    unos = Integer.parseInt(scanner.nextLine());
//                }
//
//                System.out.println("\nDa li zelite da sortirate predstave? (1 - po nazivu 2 - po id, 0 - ne))");
//                unos = Integer.parseInt(scanner.nextLine());
//                if (unos == 1)
//                    Collections.sort(repository.predstave, Comparator.comparing(Predstava::getNaziv));
//                else if (unos == 2)
//                    PredstavaController.sortPredstavaById();
//
//                for (Predstava p : repository.predstave) {
//                    System.out.println(p);
//                }
//                System.out.println("\n Da li zelite da nastavite sa koriscenjem programa? (1 - Da 2- Ne)");
//                unos = Integer.parseInt(scanner.nextLine());
//            }
        } finally {
            //repository.seedDatabase();
            repository.readDatabaseJSON();
            for(Predstava p : repository.getPredstave())
            {
                System.out.println(p);
            }
        }

    }
}


