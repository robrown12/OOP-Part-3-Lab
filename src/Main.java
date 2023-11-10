public class Main {
	
public static void main(String[] args) {
	Vehicle car = new Vehicle("Toyota", "Camry", "Blue", 2020, 4);
	Vehicle van = new Vehicle("Ford", "Transit", "White", 2019, 5);
	Vehicle motorcycle = new Vehicle("Honda", "CBR600RR", "Red", 2021, 0);
	Vehicle truck = new Vehicle("Chevrolet", "Silverado", "Black", 2018, 2);

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Van Model: " + van.getModel());
        System.out.println("Motorcycle Color: " + motorcycle.getColor());
        System.out.println("Truck Year: " + truck.getYear());
        System.out.println("Car Door Count: " + car.getDoor());
    }
}

