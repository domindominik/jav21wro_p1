package com.sda.sort;

import java.util.Random;

import static com.sda.sort.BubbleSorting.bubblesorting;
import static com.sda.sort.SelectSort.selectSort;

public class Menu
{
    public static void showMatrix(int matrix[])
    {
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print(matrix[i] + "\t");
        }
    }
    public static void main(String[] args)
    {
        int size = 50, upperBound = 260;

        int matrix[] = new int[size];

        Random random = new Random();
        random.setSeed(System.currentTimeMillis() * size);

        for (int i = 0; i < size; i++)
        {
            matrix[i] = random.nextInt(upperBound - 95);
        }

        System.out.println("Random numbers: ");
        showMatrix(matrix);

        //bubblesorting(matrix);
        selectSort(matrix);

        System.out.println("\nAfter sorting: ");
        showMatrix(matrix);
    }
}
