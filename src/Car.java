class Car extends Vehicle{

    private static final double AIR_CONDITION_CONSUMPTION = 0.8;

    private boolean airCondition;

    public Car(String name, double capacity, double consumption, boolean airCondition) {
        super(name, capacity, consumption);
        this.airCondition = airCondition;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    @Override
    public double totalConsumption() {
        return airCondition ? getConsumption() + AIR_CONDITION_CONSUMPTION : getConsumption();
    }
}
