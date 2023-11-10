public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int year;
    private int door;

    public Vehicle(String make, String model, String color, int year, int door) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.door = door;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getDoor() {
        return door;
    }
}