public class Main extends Object{
    public static void main(String[] args) {


        Student max = new Student("Max", 23);
        System.out.println(max.toString());

        PrimarySchool jimmy = new PrimarySchool("Jimmy", 8,"Carol");
        System.out.println(jimmy);
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;

//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchool extends Student{

    private String parentsName;

    public PrimarySchool(String name, int age, String parentsName) {
        super(name, age);
        this.parentsName = parentsName;
    }

    @Override
    public String toString() {
        return parentsName + "'s of the kid " + super.toString();
//        return "PrimarySchool{" +
//                "parentsName='" + parentsName + '\'' +
//                "} " + super.toString();
    }
}
