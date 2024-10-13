public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208",
                "Dell", "240");


        Monitor theMonitor = new Monitor("27inch", "Acer"
                , 27, "1920x1200");

        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208","Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixleAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Bios");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }


}
