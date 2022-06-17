package day6;



public class Task1 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(1997,"Yamaha","black");
        System.out.println(motorcycle.yearDifference(1990));
        motorcycle.info();

        Car car = new Car();

        car.setAge(1999);
        car.setColour("black");
        car.setModel("Toyota");
        System.out.println(car.yearDif(1980));
        car.info();



    }
}
