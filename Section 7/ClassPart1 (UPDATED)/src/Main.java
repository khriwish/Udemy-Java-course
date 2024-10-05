public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.describeCar();

        Car car = new Car();
        car.setMake("BMW");
        car.setModel("5M");
        car.setDoor(2);
        car.setConvertable(true);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.isConvertable());


    }
}
