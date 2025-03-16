public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 red Tesla model 3", 15.4, 6);
        runRace(tesla);

        Car ferrari1 = new HybridCar("2022 black ferrari sf90 Stradale", 16, 8,8 );
        runRace(ferrari1);

    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
