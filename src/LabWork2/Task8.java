package LabWork2;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();

        String[] array = {"1", "2", "3"};

        array = reverseArray.reverse(array);

        System.out.println(Arrays.toString(array));
    }
}

class ReverseArray {
    public String[] reverse(String[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
