public class Array {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};

        int arrSum = 0;

        for(int i = 0; i < arr.length; i++){
            arrSum += arr[i];
        }

        System.out.println("Сумма элементов всего массива: " + arrSum);
        System.out.println("Среднее арифметическое: " + arrSum/arr.length);
    }
}
