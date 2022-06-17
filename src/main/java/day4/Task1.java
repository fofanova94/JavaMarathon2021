package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner bold = new Scanner(System.in);
        System.out.println("Введи размер массива");
        int n = bold.nextInt();
        Random rand = new Random();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int count = 0;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > 8) {
                count++;
            }
            System.out.println(count);

            int count1 = 0;
            for (int j = 0; j < numbers.length; j++)
                if (numbers[j] == 1) {
                    count1++;
                }
                System.out.println(count1);


                int count2 = 0;
                for (int k = 0; k < numbers.length; k++)
                    if (numbers[k] % 2 == 0) {
                        count2++;
                    }
                    System.out.println(count2);

                    int count3 = 0;
                    for (int m = 0; m < numbers.length; m++)
                        if (numbers[m] % 2 != 0) {
                            count3++;
                        }
                    System.out.println(count3);


                    int count5 = 0;
                    for (int l = 0; l < numbers.length; l++) {
                        count5 = numbers[l] + count5;
                    }
                    System.out.println(count5);

                }
            }

