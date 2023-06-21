public class Motorcycle extends Vehicle {

    public Motorcycle(int speed) {
        super(speed);
    }

    @Override
    public int getNumberOfTires() {
        return 2;
    }
}
