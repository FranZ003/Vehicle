public class Car extends Vehicle {


    public Car(int speed) {
        super(speed);
    }

    @Override
    public int getNumberOfTires() {
        return 4;
    }
}
