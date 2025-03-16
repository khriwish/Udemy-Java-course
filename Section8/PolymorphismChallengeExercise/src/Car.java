public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void carDescription() {
        System.out.println(description);
    }

    public void startEngine() {
        System.out.println("Car starts engine");
    }

    public void drive(){
        System.out.println("person gets into car");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car Started running");

    }

}


class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void carType(){
        System.out.println();
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf(
                "%sThis car is gas-powered with %d" +
                        " cylinders and it averages %.2f litres per Km%n",
                cylinders, avgKmPerLitre
        );


    }

    class ElectricCar extends Car {
        private double avgKmPerCharge;
        private int batterySize;

        public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
            super(description);
            this.avgKmPerCharge = avgKmPerCharge;
            this.batterySize = batterySize;
        }
    }

    class HybridCar extends Car {
        private double avgKmPerLitre;
        private int batterySize;
        private int cylinders;

        public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
            super(description);
            this.avgKmPerLitre = avgKmPerLitre;
            this.batterySize = batterySize;
            this.cylinders = cylinders;
        }


    }
}


