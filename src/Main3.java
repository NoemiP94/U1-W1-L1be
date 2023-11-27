import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo:");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo:");
        double altezza = scanner.nextDouble();
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(base, altezza));

        System.out.println("Inserisci un numero intero (se è pari darà 0, se è dispari darà 1)");
        int number = scanner.nextInt();
        System.out.println("Il numero inserito è: " + pariDispari(number));

        System.out.println("Inserisci la base del triangolo");
        double baseT = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del triangolo");
        double altezzaT = scanner.nextDouble();
        System.out.println("L'area del triangolo è: " + perimetroTriangolo(baseT, altezzaT));

        scanner.close();

    }

    public static double perimetroRettangolo(double lato1, double lato2){
        return (lato1 * lato2)*2;
    }

    public static int pariDispari(int num){
        if((num%2) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static double perimetroTriangolo(double lato1, double lato2){
        return (lato1 * lato2) / 2;
    }
}
