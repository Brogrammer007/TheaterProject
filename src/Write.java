import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Write {

    public static Predstava writeFileToPredstava(String filePath){


        Predstava predstava = new Predstava("ProgramingWithUs",
                TipPredstave.DRAMA,
                "Dzo1312",
                new ArrayList<String>(Arrays.asList("Coksi","Vuk","Dzo")),
                300,
                "TurboTransProdaksn",
                2023,
                "Mucenje");


        try {

            FileWriter writer = new FileWriter(filePath);
            writer.write(

                    predstava.getNaziv() + "|"+
                            predstava.getTipPredstave()+ "|"+
                            predstava.getReziser()+ "|"+
                            predstava.getGlumci()+ "|"+
                            predstava.getTrajanje()+ "|"+
                            predstava.getProdukcija()+ "|"+
                            predstava.getGodina()+ "|"+
                            predstava.getOpis()+ "|");
            writer.close();}

        catch (IOException e){
            e.printStackTrace();
        }
        return predstava;
    }



}
