import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    public void testPark() {
        ParkingLot parkingLot = new ParkingLot(3);

        Car car = new Car("KA-01-HH-1234", "White");

        int slotNo = parkingLot.park(car);

        assertEquals(0, slotNo);

        Car car2 = new Car("KA-01-HH-9999", "White");

        int slotNo2 = parkingLot.park(car2);

        assertEquals(1, slotNo2);

        parkingLot.leave(slotNo);

        Car car3 = new Car("KA-01-BB-0001", "Black");

        int slotNo3 = parkingLot.park(car3);

        assertEquals(0, slotNo3);
    }

}
