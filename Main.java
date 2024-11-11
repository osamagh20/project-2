import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Route r1 = new Route("kharj", "riyadh", 50.0);
        Route r2 = new Route("hamraa", "jareer", 60.0);


        Car car1 = new Car("ca1234", r1, 2); 
        Car car2 = new Car("co4567", r2, 0);


        ArrayList<Passenger> passengers = new ArrayList<>();
        SubscribersPassengers s1 = new SubscribersPassengers("Ahmed", "1212");
        Non_SubscribersPassengers nonS1 = new Non_SubscribersPassengers("nasser", "3344", true);
        passengers.add(s1);
        passengers.add(nonS1);


        try {

            passengers.get(0).reserveCar(car1);
            passengers.get(1).reserveCar(car2);

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }


        for (Passenger p : passengers) {
            p.display();
            System.out.println();
        }


    }
}