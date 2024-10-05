public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("SD0192" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "Jack";
                        case 4 -> "Jane";
                        case 5 -> "Michael";
                        default -> "Anonymous";


                    }, "10/10/2004",
                    "Java coding class");
            System.out.println(s);
        }

        Student pojoStudent = new Student("SD0192","Ann","10/10/2004","Java coding class");
        LPAStudent recordStudent = new LPAStudent("SD0192", "Fadi", "10/10/2004", "Java coding class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + " Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + "Java OCP Exam 829");

        System.out.println(pojoStudent.getName()+ " is taking "+ pojoStudent.getClassList());

        //LPA
        System.out.println(recordStudent.name()+ " is taking "+ recordStudent.classList());


    }
}
