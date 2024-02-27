import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        String filePathWrite = "C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheaterProject\\resources\\write.txt";
        String filePathReade = "C:\\Users\\mmiki\\OneDrive\\Radna površina\\TheaterProject\\resources\\read.txt";

        Write.writePredstavaToFile(filePathWrite,Read.readPredstavaFromFile(filePathReade));


        System.out.println("Dobar dan  da li zelite novu predstavu da unesete");



        System.out.println("Sta ce bit sad");


}

}
