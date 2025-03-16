public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2280", "Dell","200kW gold");
        Monitor monitor = new Monitor("27inch beast", "Acer", 27,"2k");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 2,"idk" );
        PersonalComputer personalComputer = new PersonalComputer("2280","Dell",monitor, motherboard,computerCase);

//        personalComputer.getMonitor().drawPixelAt(10,20,"red");
//        personalComputer.getMotherboard().loadProgram("windows xp");
//        personalComputer.getComputerCase().pressPowerButton();

        personalComputer.powerUp();
    }
}
