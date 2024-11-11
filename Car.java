public class Car {
    public boolean discount_coupon;
    private String code;
    private Route fixedRoute;
    private int maximumCapacityPassengers;
    public Car(String code, Route fixedRoute, int maximumCapacityPassengers) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maximumCapacityPassengers = maximumCapacityPassengers;

    }
    public String getCode() {
        return code;
    }
    public Route getFixedRoute() {
        return fixedRoute;
    }
    public int getMaximumCapacityPassengers() {
        return maximumCapacityPassengers;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }
    public void setMaximumCapacityPassengers(int maximumCapacityPassengers) {
        this.maximumCapacityPassengers = maximumCapacityPassengers;
    }

}
