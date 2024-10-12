public class Main {
    public static void main(String[] args) {

        String bulletIt = "print a Bullet List: " +
                "\n\u2022 First Point" +
                "\n\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBox = """
                Print a Bullet List:
                     • First Point
                         \u2022 Sub Point""";
        System.out.println(textBox);

        int age = 35;
//        System.out.printf("your age is %d\n", age);
        System.out.printf("your age is %9.1f\n", (float) age);
        int yearOfBirth = 2024 - age;
        System.out.printf("age = %d and you were born on %d", age, yearOfBirth);

        for (int i = 1; i <= 10000; i *= 10) {
            System.out.printf("%6d%n", i);
        }

        String formatingString = String.format("your age is %d", age);
        System.out.println(formatingString);


        formatingString = "aboud is %d and was born on %d".formatted(age, yearOfBirth);
        System.out.println(formatingString);


    }
}
