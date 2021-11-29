package com.company;

//import java.util.Scanner;

public class massive5 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        final int a = (int)(Math.random()*10);
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random()*10);
        System.out.println("Array before - \n");
        for (int i: array) System.out.print(i + " ");
        int buf;

        for (int k = 0; k < array.length/2; k++){
            buf = array[array.length - k-1];
            array[array.length - k-1] = array[k];
            array[k] = buf;
         }
        System.out.println("\nArray after - \n");
        for (int i: array) System.out.print(i + " ");
    }
}
