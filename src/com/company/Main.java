package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int [4];
        array[0] = 5;
        array[1] = 0;
        array[2] = 384;
        array[3] = 22;
        for(int i = 0;i < 4;i++) {
            System.out.print((i + 1) + " " + array[i] + "\n");
        }
    }
}
