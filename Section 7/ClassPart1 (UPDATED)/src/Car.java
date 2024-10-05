public class Car {
private String make = "Volvo";
private String model = "Chevrolet";
private String color = "Blue";
private int door = 2;
private boolean convertable = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setMake(String make) {
        if(make == null) this.make = "unknown";

        String lowerCase = make.toLowerCase();

        switch(lowerCase){
            case "volvo","honda","porsche" -> this.make = make;
            default -> this.make = "Not supported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public void describeCar(){
    System.out.println("Make : " + make);
    System.out.println("Model : " + model);
    System.out.println("Color : " + color);
    System.out.println("Doors : " + door);
    System.out.println(convertable ? "Convertable" : "Not convertable");

}



}
