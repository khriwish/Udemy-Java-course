public class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal() {
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void speedAnimal(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {

        System.out.println(type + " some makes type of noise");
    }

}
