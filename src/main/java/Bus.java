import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;
    private int capacity;
    private String destination;


    public Bus(String destination){
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.capacity = 15;
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
