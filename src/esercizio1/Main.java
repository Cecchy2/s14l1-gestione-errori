package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(10);
        int[] casualArray = new int[5];

        for (int i = 0; i < casualArray.length; i++) {
            casualArray[i] = random.nextInt(10) + 1;
            System.out.println(casualArray[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero da 1 a 10");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 10 || number < 1) {
            System.out.println("il numero non è corretto, deve essere da 1 a 10");
            return;
        }
        System.out.println("inserisci la posizione da 1 a 10");
        int position = Integer.parseInt(scanner.nextLine());
        if (position < 1 || position > 5) {
            System.out.println("errore, la posizione deve essere tra 1 e 5");
            return;
        }
        casualArray[position - 1] = number;
        for (int i = 0; i < casualArray.length; i++) {
            System.out.println(casualArray[i]);

        }
    }
}