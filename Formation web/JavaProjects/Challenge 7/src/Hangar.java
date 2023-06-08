public class Hangar {

    public static void main(String[] args) {

        Car car1 = new Car("Clio", 5000);
        Boat boat1 = new Boat("Titanic", 100000);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}
