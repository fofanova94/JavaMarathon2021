package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши город");
        while (true){
        String city = scanner.nextLine();

        if (city.equals("Stop"))
            break;


        switch (city) {
            case "Милан":
            case "Рим":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Лондон":
            case "Манчестер":
                System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("Неизвестная страна");
        }

    }
}}
