import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            arr[i] = scanner.nextInt();
        }

        int arrLen = arr.length - 1;

        int arrSum = 0;
        int minElem = Integer.MAX_VALUE;
        int maxElem = 0;

        while (arrLen >= 0){
            int elem = arr[arrLen];

            arrSum += elem;

            if(elem < minElem){
                minElem = elem;
            }
            if(elem > maxElem){
                maxElem = elem;
            }

            arrLen -= 1;
        }

        System.out.println("Сумма массива: " + arrSum);
        System.out.println("Минимальное число: " + minElem);
        System.out.println("Максимальное число: " + maxElem);
    }
}
