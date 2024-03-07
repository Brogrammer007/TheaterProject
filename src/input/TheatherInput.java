package input;

import models.TipPredstave;

import java.util.Scanner;

public class TheatherInput {

    private static final Scanner scanner = new Scanner(System.in);
    public static int inputInt() {
        // TODO implement this
        return 0;
    }

    public static TipPredstave inputTipRedstave(String label) {
        while (true) {
            try {
                System.out.print(label+" ");
                TipPredstave tipPredstave = TipPredstave.valueOf(scanner.nextLine().toUpperCase());
                return tipPredstave;
            } catch (Exception e) {
                System.out.println("Niste uneli dobar tip predstave, pokusajte ponovo");
            }
        }
    }

}
