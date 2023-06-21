public abstract class Vehicle {
    public int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract int getNumberOfTires();
}
