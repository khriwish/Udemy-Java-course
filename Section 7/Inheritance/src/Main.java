public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic", "huge", 400);
        doAnimalStuff(animal, "slow");


        Dog puppy = new Dog();
        System.out.println(puppy);

        Dog dog = new Dog("Dog", "small", 30);
        System.out.println(dog);

        Dog yorkie = new Dog("Yorkie", 30);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("labrador retriever", 65, "floppy", "swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("wolf", 100);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("goldfish",2.5,2,3);
        doAnimalStuff(goldie, "fast");

    }



    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.speedAnimal(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _ _");

    }

}
