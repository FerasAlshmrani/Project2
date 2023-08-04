import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // i used try catch for both toString and carPass " Car passenger " methods
        // so you cant deal with maxCapacity = 0

        Route r1 = new Route(1000,"riyadh","dammam");
        Route r2 = new Route(500,"makkah","jeddah");

        Car c1 = new Car("A0305fk",r1,0);
        Car c2 = new Car("CAR_CODE123",r2,10);

        Passenger p1 = new NonPassengers("Feras","123a",c1,false);
        Passenger p2 = new SubPassengers("Feras","123a",c2);
        ArrayList<Passenger> a1 = new ArrayList<Passenger>();

        a1.add(p1);
        a1.add(p2);

        p1.carPass();
        p2.carPass();

        for(Passenger n : a1){
            System.out.println(n.toString());
        }


    }
}