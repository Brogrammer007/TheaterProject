import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        Scanner scn = new Scanner();

        String filePathPredstave = "C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheaterProject\\resources\\predstave.txt";

        ArrayList<Predstava> predstave = FileHandler.readPredstavaFromFile(filePathPredstave);

        for(Predstava p : predstave) {
            System.out.println(p);
        }

        // unesete predstavu sa tastature
        // System.out.print("Unesite naziv predstave: ")
        // String noviNazivPredstave = scn.nextLine();
        // .
        // .
        // .

        // System.out.print("Unesite glumce:")
        // String unosi = "1";
        // ArrayList<String> noviGlumci = new ArrayList<String();
        // while(unosi == "1") {
        //     String noviGlumac = scn.nextLine();
        //     noviGlumci.add(noviGlumac);
        //     System.out.print("Ako zelite da prekinete unesite broj razlicit od 1:")
        //     unosi = scn.nextLine();
        // }


        ArrayList<String> glumci = new ArrayList<String>();
        glumci.add("Nikola");
        Predstava novaPredstava = new Predstava(predstave.size() + 1, "Nova predstava", TipPredstave.DRAMA, "Vuk", glumci, 120, "Coxi", 1997, "Nova predstava za da se pogleda");
        predstave.add(novaPredstava);


        // sort po nazivu predstave
        // sort po id -- na kraju dana

        for(Predstava p : predstave) {
            System.out.println(p);
        }

        FileHandler.writePredstavaToFile(filePathPredstave, predstave);
    }

}
