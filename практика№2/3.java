/*Определить матрицу (двумерный массив) и ее заполнить случайными
значениями. Построить вектор В, которой возвращает — произведение
положительных элементов в каждом столбце матрицы.*/

package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr;
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        int temp = 0;
        int z = 1;
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] > 0){
                    temp = arr[j][i];
                    z = z * temp;
                }
            }
            System.out.println("Column product " + (i + 1) + "  matrices: " + z);
            z = 1;
        }
        System.out.println("");
    }
}