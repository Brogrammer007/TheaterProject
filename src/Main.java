import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String filePath = "resources/write.txt";
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

                    predstava1.getNaziv() + " | "+
                    predstava1.getTipPredstave()+ " \n "+
                    predstava1.getReziser()+ " \n "+
                    predstava1.getGlumci()+ " \n "+
                    predstava1.getTrajanje()+ " \n "+
                    predstava1.getProdukcija()+ " \n "+
                    predstava1.getGodina()+ " \n "+
                    predstava1.getOpis()+ " \n ");
            writer.close();}

        catch (IOException e){
            e.printStackTrace();
        }


        















}
}
