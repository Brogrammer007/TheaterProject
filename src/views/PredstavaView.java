package views;

import input.TheatherInput;
import models.Predstava;
import models.TipPredstave;

import java.util.ArrayList;
import java.util.Scanner;


public class PredstavaView {

    public static Predstava createPredstava() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite naziv predstave:");
        String naziv = scanner.nextLine();

        TipPredstave tip = TheatherInput.inputTipRedstave("Unesite tip predstave:");

        System.out.println("Unesite ime i prezime režisera:");
        String reziser = scanner.nextLine();

        System.out.println("Unesite glumce (svakog glumca unesite u novi red, za kraj unesite prazan red):");
        ArrayList<String> glumci = new ArrayList<>();
        String glumac = scanner.nextLine();
        while (!glumac.isEmpty()) {
            glumci.add(glumac);
            glumac = scanner.nextLine();
        }

        System.out.println("Unesite trajanje predstave u minutima:");
        int trajanje = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Unesite naziv produkcije:");
        String produkcija = scanner.nextLine();

        System.out.println("Unesite godinu izvođenja:");
        int godina = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Unesite opis predstave:");
        String opis = scanner.nextLine();

        return new Predstava(naziv,tip, reziser,glumci, trajanje, produkcija, godina, opis);
    }

    public static void printPredstave(ArrayList<Predstava> predstave) {
        System.out.println("Id |  labla");
        for(Predstava p : predstave) {
            System.out.println(p);
        }
        System.out.println("----------------------");
    }
}
