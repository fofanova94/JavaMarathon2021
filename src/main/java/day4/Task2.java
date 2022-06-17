package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(10000);
        int max = 0;
        int min = 10000;
        for (int maxNumber : numbers)
            if (maxNumber > max) {
                max = maxNumber;

            }

        System.out.println(max);

        for (int minNumber : numbers)
            if (minNumber < min) {
                min = minNumber;

            }

        System.out.println(min);

        int count = 0;
        for (int num : numbers) {
            if (num % 10 == 0) {
                count++;
            }
        }
        System.out.println(count);

        int sum = 0;
        for (int num : numbers){
            if (num%10==0){
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }

}


