public class NonPassengers extends Passenger{

    private boolean coupon;
    public NonPassengers(String name, String id, Car car ,boolean coupon) {
        super(name, id, car);
        this.coupon = coupon;

    }

    @Override
    public void carPass() {
            try{
                check();
                if(coupon == true){
                setTripCost((int)(getCar().getRoute().getPrice() - (getCar().getRoute().getPrice()*0.1)));
                }else {
                    setTripCost(getCar().getRoute().getPrice());
                }
            }catch (Exception e1){
                System.out.println("You can't car passenger because :"+e1.getMessage());
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

