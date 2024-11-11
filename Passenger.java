public abstract class Passenger {
    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;
    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double trip_cost) {
        this.tripCost = trip_cost;
    }

    public abstract void reserveCar(Car car) throws Exception;
    public abstract void display();

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }
}
