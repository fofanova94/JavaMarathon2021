package day6;

public class Car {
    public int age;
    public String model;
    public String colour;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDif (int year){
        year = year-getAge();
        return Math.abs(year);
    }
}


