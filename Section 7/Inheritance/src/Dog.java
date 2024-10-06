public class Dog extends Animal {

    private String tailShape;
    private String earShape;


    public Dog() {
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ?
                "large" : "huge"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    public Dog(String type, double weight) {
        this(type, weight, "perky", "curled");
    }

    public void dogBark() {
    }


    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if( type == "wolf"){
            System.out.println("wooo woooo");
        }

        bark();
        System.out.println();
    }

    @Override
    public void speedAnimal(String speed) {
        super.speedAnimal(speed);
//        System.out.println("dogs walk, run, and wag their tail");

        if(speed == "slow"){
            walk();
            wagTail();
        }
        else
        {
            run();
            bark();
        }
        System.out.println();

    }

    private void bark(){
        System.out.print("bark ");
    }

    private void run(){
        System.out.print("run ");
    }

    private void walk(){
        System.out.print("dog walking ");
    }

    private void wagTail(){
        System.out.print("tail wagging ");
    }

}

