package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double x = a.nextDouble();
        double y =0;
        if (x>=5){
            y = (Math.pow(x,2)-10)/(x+7);}
        else if (x>-3 && x<5){
            y = (x+3)*(Math.pow(x,2-2)-2);}
        else {y = 420;};
        System.out.println(y);


        }

    }
