import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamano = scanner.nextInt();

        int[] arr = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        for(float num: plusMinus(arr)){
            System.out.println(String.format("%.6f",(num/ arr.length)));
        }
    }
    //Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
    // Print the decimal value of each fraction on a new line with  places after the decimal.
    public static int[] plusMinus(int[] nums){
        int cantPos = 0;
        int cantCero =0;
        int cantNeg =0;
        for(int num : nums){
            if (num>0){
                cantPos++;
            } else if (num<0) {
                cantNeg++;
            } else if (num==0){
                cantCero++;
            }
        }
        int[] resultado = {cantPos, cantNeg, cantCero};
        return resultado;
    }
}