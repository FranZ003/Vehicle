
public class Main {

    public static void main(String[] args) {
      Car a=new Car(
        130
      );

        Motorcycle b=new Motorcycle(
                90
        );
        System.out.println("Velocità della macchina: " + a.getSpeed() + " km");
        System.out.println("Numero di ruote: " + a.getNumberOfTires());
        System.out.println("Velocità della moto: " + b.getSpeed() + " km");
        System.out.println("Numero di ruote: " + b.getNumberOfTires());
    }
}