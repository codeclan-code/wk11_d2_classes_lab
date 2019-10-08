import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;
    private int capacity;
    private String destination;


    public Bus(String destination, int capacity){
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.capacity = capacity;
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        Passenger passengers[];
      for (Passenger person : this.passengers){
          if (Passenger passengers <= capacity){
              this.passengers(passenger)
          }
      }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
