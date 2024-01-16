import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String filePath = "C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheatarProjectApp\\TheaterProject\\resources\\write.txt";
        Predstava predstava1 = new Predstava(
                "ProgramingWithUs",
                TipPredstave.DRAMA,
                "Dzo",
                new ArrayList<String>(Arrays.asList("Coksi","Vuk","Dzo")),
                300,
                "TurboTransProdaksn",
                2023,
                "Mucenje");

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(

                    predstava1.getNaziv() + "|"+
                    predstava1.getTipPredstave()+ "|"+
                    predstava1.getReziser()+ "|"+
                    predstava1.getGlumci()+ "|"+
                    predstava1.getTrajanje()+ "|"+
                    predstava1.getProdukcija()+ "|"+
                    predstava1.getGodina()+ "|"+
                    predstava1.getOpis()+ "|");
            writer.close();}

        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Sta ce bit sad");
}
}
