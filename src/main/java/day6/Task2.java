package day6;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Bowing", 2002, 30, 5);
        airplane.setLength(50);
        airplane.setYear(2019);
        airplane.fillUp(20);
        airplane.fillUp(60);
        airplane.info();
    }
}
