public class TestApp {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car("Maserati GT", 120,11,false);
        cars[1] = new Truck("Jelcz", 340,25,false, 400);

        for (Car car: cars) {
            System.out.println(car.getName() + "Spalanie " + car.range());
        }

        for (Car car: cars) {
            car.setAirCondition(true);
            System.out.println(car.getName() + "Spalanie " + car.range());
        }
    }
}
