package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Random random = new Random(10);
        int[] casualArray = new int[5];

        for (int i = 0; i < casualArray.length; i++) {
            casualArray[i] = random.nextInt(10) + 1;

        }
        logger.info(Arrays.toString(casualArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero da 1 a 10");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 10 || number < 1) {
            logger.error("il numero non è corretto, deve essere da 1 a 10");
            return;
        }
        System.out.println("inserisci la posizione da 1 a 5");
        int position = Integer.parseInt(scanner.nextLine());
        if (position < 1 || position > 5) {
            logger.error("errore, la posizione deve essere compresa tra 1 e 5");
            return;
        }
        casualArray[position - 1] = number;
        for (int i = 0; i < casualArray.length; i++) {
        }
        logger.info(Arrays.toString(casualArray));
        scanner.close();
    }

}