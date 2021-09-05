package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество элементов одномерного массива");
        int number = in.nextInt();
        int array[] = new int [number];


        for(int i = 0;i < number;i++) {
            System.out.println("Введите "+(i + 1) + " элемент");
            array[i] = in.nextInt();
        }
        System.out.print("Содержимое массива:");
        for(int i = 0;i < number;i++) {
            System.out.print(" " + array[i]);
        }
        int sum = 0;
        for(int i = 0;i < number;i++) {
            sum = sum + array[i];
        }
        System.out.println("\nСумма элементов массива:" + sum);
    }
}
