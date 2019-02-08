public class Vehicle {
    private String name;
    private double capacity;
    private double consumption;

    public Vehicle(String name, double capacity, double consumption) {
        this.name = name;
        this.capacity = capacity;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double range() {
        return capacity / totalConsumption() * 100;
    }

    public double totalConsumption() {
        return consumption;
    }
}
