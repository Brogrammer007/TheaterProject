import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

<<<<<<< Updated upstream
    public static ArrayList<Predstava> predstave(){
        ArrayList<Predstava> predstavaList = new ArrayList<>();
        Predstava predstava = new Predstava(
                0,
                "BangBros",
                TipPredstave.DRAMA,
                "Vuk",
                new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),
                300,
                "Nebitno",
                2023,
                "Ozbiljna prica");

        Predstava predstava1 = new Predstava(
                0,
                "BangBros",
                TipPredstave.DRAMA,
                "Vuk",
                new ArrayList<String>(Arrays.asList("Vuk", "Dzoni", "Coksi")),
                300,
                "Nebitno",
                2023,
                "Ozbiljna prica");
        predstavaList.add(predstava);
        predstavaList.add(predstava1);
        return predstavaList;
    }

    public static void main(String[] args) {

        String filePathWrite = "resources/write.txt";
        String filePathReade = "resources/read.txt";
        ArrayList<Predstava> predstavaList = predstave();


        Write.writePredstavaToFile(filePathWrite,predstavaList);


        System.out.println("Dobar dan  da li zelite novu predstavu da unesete");

        //predstavaList = Read.readPredstavaFromFile(filePathReade);
        //for(Predstava p : predstavaList)
        //    System.out.println(p.getId() + p.getNaziv()+p.getTipPredstave()+ p.getReziser());
        Read.readThenWrite(filePathReade,filePathWrite);

        System.out.println("Sta ce bit sad");


}
=======
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String filePathPredstave = "C:\\Users\\matij\\Documents\\GitHub\\TheaterProject\\resources\\predstave.txt";

        ArrayList<Predstava> predstave = FileHandler.readPredstavaFromFile(filePathPredstave);

//        for(Predstava p : predstave) {
//            System.out.println(p);
//        }

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
                unos = scanner.nextInt();
            }


//        ArrayList<String> glumci = new ArrayList<String>();
//        glumci.add("Nikola");
//        Predstava novaPredstava = new Predstava(predstave.size() + 1, "Nova predstava", TipPredstave.DRAMA, "Vuk", glumci, 120, "Coxi", 1997, "Nova predstava za da se pogleda");
//        predstave.add(novaPredstava);
            System.out.println("\n Da li zelite da sortirate predstave? (1 - po nazivu 2 - po id, 0 - ne))");
            unos = Integer.parseInt(scanner.nextLine());
            if (unos == 1)
                Collections.sort(predstave, new Comparator<Predstava>() {
                    public int compare(Predstava p1, Predstava p2) {
                        return p1.getNaziv().compareTo(p2.getNaziv());
                    }

                });
            else if (unos == 2)
                Collections.sort(predstave, new Comparator<Predstava>() {
                    public int compare(Predstava p1, Predstava p2) {
                        if (p1.getId() > p2.getId())
                            return 1;
                        else
                            return -1;
                    }

                });


            // sort po nazivu predstave
            // sort po id -- na kraju dana

            for (Predstava p : predstave) {
                System.out.println(p);
            }

            FileHandler.writePredstavaToFile(filePathPredstave, predstave);
            System.out.println("\n Da li zelite da nastavite sa koriscenjem programa? (1 - Da 2- Ne)");
            unos = Integer.parseInt(scanner.nextLine());
        }
    }
>>>>>>> Stashed changes

}
