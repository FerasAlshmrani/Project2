public class Route {

    private int price;
    private String pickUp;
    private String destination;


    public Route(int price, String pickUp, String destination) {
        this.price = price;
        this.pickUp = pickUp;
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

