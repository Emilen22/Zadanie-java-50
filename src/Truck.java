public class Truck extends Car {

    private static final double AIR_CONDITION_CONSUMPTION = 1.6;
    private static final double ADDITIONAL_LOAD_CONSUMPTION = 0.5;

    private double load;

    public Truck(String name, double capacity, double consumption, boolean airCondition, double load) {
        super(name, capacity, consumption, airCondition);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public double totalConsumption() {
        double totalConsumption = getConsumption();
        if (isAirCondition()) {
            totalConsumption += AIR_CONDITION_CONSUMPTION;
        }
        double loadConsumption = load / 100 * ADDITIONAL_LOAD_CONSUMPTION;
        totalConsumption += loadConsumption;
        return totalConsumption;
    }
}