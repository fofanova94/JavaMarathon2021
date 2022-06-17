package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       int  counter =0;
        while (counter<5) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите два числа");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
            counter++;
                if (b != 0) {
                    double c = a / b;
                    System.out.println(c);
                    continue;
                } else
                    break;
            }
        }
    }
