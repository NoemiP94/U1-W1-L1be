import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int resultProduct = product(6, 4);
        System.out.println(resultProduct);

        String resultConcat = concat("Ciao", 5);
        System.out.println(resultConcat);

    }
    public static int product(int num1, int num2){
        return num1 * num2;
    }

    public static String concat(String str1, int num3){
        return str1 + num3;
    }

    /*public static Arrays arrayOfString(String[] arr1, String str2){
        String[] array = {"ciao", "Java", "cane", "gatto", "codice"};
        String stringa = "caldo";
        return array + stringa;
    }*/
}