package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(esercizio1.Main.class);

    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("inserisci i km ");
            double km = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci i litri");
            double litri = Integer.parseInt(scanner.nextLine());

            double kmAlLitro = km / litri;
            logger.info("i km per litro sono: " + kmAlLitro);
        } catch (ArithmeticException e) {
            logger.error("Errore del calcolo" + e.getMessage());
        } catch (NumberFormatException e) {
            logger.error("Errore, devi inserire un numero non una lettera" + e.getMessage()
            );
        }

    }
}
