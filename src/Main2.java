import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi la prima parola");
        String word1 = scanner.nextLine();
        System.out.println("Scrivi la seconda parola");
        String word2 = scanner.nextLine();
        System.out.println("Scrivi la terza parola");
        String word3 = scanner.nextLine();

        String completeString = word1 + " " + word2 + " " + word3;
        System.out.println("Il risultato è: " + completeString);

        String reverseCompleteString = word3 + " " + word2 + " " + word1;
        System.out.println("La stringa al contrario è : " + reverseCompleteString);

        scanner.close();

    }

}
