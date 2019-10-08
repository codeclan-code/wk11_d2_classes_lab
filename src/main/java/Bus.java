import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> capacity;
    private String destination;


    public Bus(String destination){
        this.destination = destination;
        this.capacity = new ArrayList<Passenger>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.capacity.size();
    }

    public void addPassenger(Passenger passenger) {
        this.capacity.add(passenger);
    }
}
