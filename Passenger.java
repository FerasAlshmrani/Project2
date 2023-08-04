public abstract class Passenger {

    private String name;
    private Car car;
    private String id;
    private int tripCost;



    public Passenger(String name, String id, Car car ) {
        this.name = name;
        this.id = id;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public int getTripCost() {
        return tripCost;
    }

    public void setTripCost(int tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void carPass();

    public abstract String toString();

    public void check()throws Exception{
        if (getCar().getMaxCapacity() <= 0){
            throw new Exception(" Maximum Capacity car is equal Zero");
        }
    }

}
