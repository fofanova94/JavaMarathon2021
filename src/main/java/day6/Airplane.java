package day6;

public class Airplane {

    String manufacturer;
    int year;
    int length;
    int weight;
    int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ". Год выпуска: " + year + ". Длина: " + length + ". Вес: " + weight + ". Количество топлива в баке: " + fuel);
    }

    public int fillUp(int fillUp) {
       this.fuel = getFuel() + fillUp;
        return this.fuel;
    }
}
