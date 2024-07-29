package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("inserisci i km ");
            double km = Integer.parseInt(scanner.nextLine());
            System.out.println("inserisci i litri");
            double litri = Integer.parseInt(scanner.nextLine());

            double kmAlLitro = km / litri;
            System.out.println("i km per litro sono: " + kmAlLitro);
        } catch (ArithmeticException e) {
            System.out.println("Errore del calcolo" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Errore, devi inserire un numero non una lettera" + e.getMessage()
            );
        }

    }
}
