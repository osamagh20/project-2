public class Route {
    private String start_pick_up_address;
    private String destination_address;
    private double tripPrice;
    public Route(String start_pick_up_address, String destination_address, double tripPrice) {
        this.start_pick_up_address = start_pick_up_address;
        this.destination_address = destination_address;
        this.tripPrice = tripPrice;

    }

    public String getStart_pick_up_address() {
        return start_pick_up_address;
    }

    public void setStart_pick_up_address(String start_pick_up_address) {
        this.start_pick_up_address = start_pick_up_address;
    }

    public String getDestination_address() {
        return destination_address;
    }

    public void setDestination_address(String destination_address) {
        this.destination_address = destination_address;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
