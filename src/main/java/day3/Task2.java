package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b!=0){
            double c = a/b;
            System.out.println(c);
        }
        else
            break;}

    }
}
