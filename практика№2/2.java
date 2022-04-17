// Дан массив x(n). Переписать в массив y(n) отрицательные элементы массива x деленные на 2. Затем упорядочить по возрастанию новый массив. 
package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    private static final int n = 3;
    public static void main(String[] args) {
        int[] x = new Random().ints(n, -99, 99).toArray();
        int[] y = new int[n];
        Arrays.setAll(y, i -> {
            return (x[i] < 0) ? x[i] : 0;
        });
        Arrays.sort(y);
        print_array(x);
        for (int i = 0; i < y.length; i++) {
            if (y[i] < 0) {
                y[i] = x[i] / 2;
            } else{
                y[i] = 0;
            }
        }
        print_array(y);
    }
    private static void print_array(int[] x) {
        Arrays.stream(x).forEach(e -> System.out.printf("% 5d", e));
        System.out.println();
    }
}