package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Inserted array elements: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(" " + array[i]);
        }
        System.out.println("Answer: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0)
            System.out.println(" " + array[i]);
        }
    }
}
