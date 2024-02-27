import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePathPredstave = "C:\\Users\\matij\\Documents\\GitHub\\TheaterProject\\resources\\predstave.txt";
        ArrayList<Predstava> predstave = FileHandler.readPredstavaFromFile(filePathPredstave);

        int unos = 1;
        while (unos == 1) {
            System.out.println("Da li zelite da unesete novu predstavu:(1 - Da, 2 - Ne)");
            unos = Integer.parseInt(scanner.nextLine());
            while (unos == 1) {
                int id = predstave.size() + 1;

                System.out.println("Unesite naziv predstave:");
                String naziv = scanner.nextLine();

                System.out.println("Unesite tip predstave:");
                TipPredstave tip = TipPredstave.valueOf(scanner.nextLine().toUpperCase());

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

                predstave.add(new Predstava(id, naziv, tip, reziser, glumci, trajanje, produkcija, godina, opis));
                System.out.println("Da li zelite da unesete novu predstavu:(1 - Da, 2 - Ne)");
                unos = Integer.parseInt(scanner.nextLine());
            }

            System.out.println("\nDa li zelite da sortirate predstave? (1 - po nazivu 2 - po id, 0 - ne))");
            unos = Integer.parseInt(scanner.nextLine());
            if (unos == 1)
                Collections.sort(predstave, Comparator.comparing(Predstava::getNaziv));
            else if (unos == 2)
                Collections.sort(predstave, Comparator.comparingInt(Predstava::getId));

            for (Predstava p : predstave) {
                System.out.println(p);
            }

            FileHandler.writePredstavaToFile(filePathPredstave, predstave);
            System.out.println("\n Da li zelite da nastavite sa koriscenjem programa? (1 - Da 2- Ne)");
            unos = Integer.parseInt(scanner.nextLine());
        }
    }
}
