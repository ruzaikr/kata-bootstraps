import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<ParkingSlot> slots;

    ParkingLot(int size) {
        slots = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public int park(Car car) {
        for (int i = 0; i < slots.size(); i++) {
            ParkingSlot slot = slots.get(i);

            if (slot.isAvailable()) {
                slot.assign(car);
                return i;
            }
        }
        return -1;
    }

    public void leave(int slotId) {
        ParkingSlot slot = slots.get(slotId);
        slot.unAssign();
    }

}
