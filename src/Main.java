import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        String filePath = "resources/write.txt";
        String filePath2 = "resources/read.txt";


        //Example usage:
          Predstava predstavaWrite = Write.writePredstavaToFile(filePath);

        Read read = new Read();
        // Example usage:
            Predstava predstavaRead = Read.readPredstavaFromFile(filePath2);

            System.out.println("Predstava read from file:");
            System.out.println(predstavaRead.getNaziv());
            System.out.println(predstavaRead.getId());
            System.out.println(predstavaRead.getGlumci());

    }

}