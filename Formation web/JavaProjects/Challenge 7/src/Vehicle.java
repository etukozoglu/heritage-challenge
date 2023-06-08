public abstract class Vehicle {

    //attributes
    private String brand;
    private int kilometers;

    //constructors

    public Vehicle (String brand, int kilometers) {
        this.brand=brand;
        this.kilometers=kilometers;
    }

    // getters and setters
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();





}
