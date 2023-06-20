package br.com.william.exceptions.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] vector = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vector[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }
        System.out.println("Program finished.");
        scanner.close();
    }
}
