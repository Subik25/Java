/* Дан двумерный массив А, размером (nхn) (или квадратная матрица А).
Найти максимальный элемент среди отрицательных элементов параллели
побочной диагонали, расположенной над диагональю*/

package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int n = 3;
        int e = -100;
        int[][] A;
        A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (int) (Math.random() * -10);
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int z = n-1; z > 0; z--) {
            if (A[z][z-1] > e && A[z][z-1] < 0) {
                e = A[z][z-1];
            }
        }
        System.out.println("Maximum negative number: " + e);
    }
}