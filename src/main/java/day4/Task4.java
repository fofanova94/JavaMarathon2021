package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(1000);
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }

        }
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
