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

    public static String[] inserisciInArray(String[] array, String s){
        String[] newArray = new String[6];
        for( int i = 0; i< 2; i++){
            newArray[i] = array[i];

        }
        newArray[2] = s;
        for(int i = 3; i < newArray.length; i++){
            newArray[i] =array[i-1];
        }
        return newArray;
    }
}