public class ParkingSlot {

    private int id;

    private Car car;

    ParkingSlot(int id) {
        this.id = id;
    }

    public void assign(Car car) {
        this.car = car;
    }

    public void unAssign() {
        this.car = null;
    }

    public boolean isAvailable() {
        return car == null;
    }

}
