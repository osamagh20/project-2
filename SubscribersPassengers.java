public class SubscribersPassengers extends Passenger{

    public SubscribersPassengers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaximumCapacityPassengers() == 0) {
            throw new Exception("Car capacity is zero. Cannot reserve this car.");
        }

        double tripPrice = car.getFixedRoute().getTripPrice();
        double discountedPrice = tripPrice * 0.5;

        setTripCost(discountedPrice);
        setReservedCar(car);
    }

    @Override
    public void display() {
        System.out.println("Subscriber Passenger Information:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());

        if (getReservedCar() != null) {
            System.out.println("Reserved Car Code: " + getReservedCar().getCode());
        } else {
            System.out.println("Reserved Car: not enough capacity!");
        }
        System.out.println("Trip Cost: " + getTripCost());
    }
}
