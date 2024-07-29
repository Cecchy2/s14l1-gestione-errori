import esercizio3.BancaException;
import esercizio3.ContoCorrente;
import esercizio3.ContoOnLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Banca {
    private static Logger logger = LoggerFactory.getLogger(esercizio1.Main.class);

    public static void main(String args[]) {
        /*ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.5);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);

            conto2.stampaSaldo();

        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }*/


        Scanner scanner = new Scanner(System.in);
        ContoCorrente conto3 = new ContoCorrente("Dario Cecchinato", 70000);

        logger.info("il saldo iniziale è :" + conto3.restituisciSaldo());
        System.out.println("inserisci l'importo da prelevare");

        double importo = Double.parseDouble(scanner.nextLine());

        try {
            conto3.preleva(importo);
            logger.info("Nuovo saldo: " + conto3.restituisciSaldo());
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }
        scanner.close();

        Scanner scanner2 = new Scanner(System.in);
        ContoOnLine conto4 = new ContoOnLine("Lino Banfi", 20000.00, 300);
        System.out.println("Scegli l'importo da prelevare");
        double importo2 = Double.parseDouble(scanner.nextLine());

        try {
            conto4.preleva(importo2);
        } catch (BancaException e) {
            throw new RuntimeException(e);
        }
    }
}
