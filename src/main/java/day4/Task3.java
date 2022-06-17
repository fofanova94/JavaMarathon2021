package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[12][8];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        int sum = 0;
        for (int l = 0; l < numbers.length; l++) {
            int max = 0;
            for (int m = 0; m < numbers[l].length; m++) {
                max += numbers[l][m];
            }
            if (max>sum){
                sum=max;
            }
        }
        System.out.println(sum);

    }
}
