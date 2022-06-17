package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
        System.out.println("Введите этаж");
        b = a.nextInt();
        if (b >= 1 && b <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (b >= 5 && b <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (b >= 9) {
            System.out.println("Высокоэтажный дом");
        } else if (b < 1) {
            System.out.println("Ошибка значения");
        }

    }}