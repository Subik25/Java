//Переписать элементы массива в обратном порядке на том же месте. Вывести измененный массив на экран.
package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int size = arr.length;
        for (int i = 0; i < size/2; i++){
           int temp = arr[i];
           arr[i]=arr[size - 1 - i];
           arr[size -1 - i]=temp;
        }
        System.out.println("Массив в обратном порядке:");
        System.out.println(Arrays.toString(arr));
    }
}