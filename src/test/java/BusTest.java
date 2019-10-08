import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

   private Bus bus;
   private Passenger passenger;

   @Before
    public void before()
   {
    bus = new Bus("Edinburgh", 5);
    passenger = new Passenger();
   }

   @Test
    public void busHasDestination(){
       assertEquals("Edinburgh", bus.getDestination());
   }

   @Test
    public void busStartsEmpty(){
       assertEquals(0, bus.passengerCount());
   }

//   @Test
//    public void canAddPassenger(){
//       bus.addPassenger(passenger);
//       assertEquals(1, bus.passengerCount());
//   }

   @Test
    public void hasCapacity(){
       assertEquals(5, bus.getCapacity());
   }

   @Test
    public void canAddIfHasCapacity(){
       bus.addPassenger(passenger);
       bus.addPassenger(passenger);
       bus.addPassenger(passenger);
       assertEquals(3,bus.passengerCount());
   }

    @Test
    public void cannotAddIfNoCapacity(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(0,bus.passengerCount());
    }

}
