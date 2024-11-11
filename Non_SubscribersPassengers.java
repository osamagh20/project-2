public class Non_SubscribersPassengers extends Passenger{
    private boolean discount_coupon;
    public Non_SubscribersPassengers(String name, String ID,boolean discount_coupon) {
        super(name, ID);
        this.discount_coupon = discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }
    public boolean getDiscount_coupon() {
        return discount_coupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaximumCapacityPassengers() == 0) {
            throw new Exception("Car capacity is zero,Cannot reserve this car!");
        }

        double discountedPrice = car.getFixedRoute().getTripPrice();

        if (discount_coupon) {
            discountedPrice = discountedPrice * 0.10;
        }

        setTripCost(discountedPrice);
        setReservedCar(car);
    }

    @Override
    public void display() {
        System.out.println("Non-Subscriber Passenger Information:");
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
