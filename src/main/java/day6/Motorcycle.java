package day6;


public class Motorcycle {
    public int age;
    public String model;
    public String colour;

    public Motorcycle(int age, String model, String colour) {
        this.age = age;
        this.model = model;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {

        inputYear = inputYear - getAge();
        return Math.abs(inputYear);
    }
}


