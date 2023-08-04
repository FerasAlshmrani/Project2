public class SubPassengers extends Passenger {


    public SubPassengers(String name, String id, Car car) {
        super(name, id, car);
    }

    @Override
    public void carPass() {
        try{
            check();
            setTripCost(getCar().getRoute().getPrice()/2);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }


    @Override
    public String toString() {
        try{
            check();
            return "name :"+getName()+",ID : "+getId()+" Trip cost :"+getTripCost()+", car code :"+getCar().getCode()+", and the route price is "+getCar().getRoute().getPrice();
        }catch (Exception e1){
            return "Sorry cant deal with :"+e1.getMessage();
        }
    }

    }


