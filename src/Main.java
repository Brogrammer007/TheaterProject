import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String filePathWrite = "resources/write.txt";
        String filePathReade = "resources/read.txt";


        Predstava predstava1 = Write.writePredstavaToFile(filePathWrite);

dada

        System.out.println("Sta ce bit sad");


        Predstava predstava2 = Read.readPredstavaFromFile(filePathReade);
        System.out.println(predstava2.getGlumci());
}

}
