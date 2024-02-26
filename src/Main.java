import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

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

}
