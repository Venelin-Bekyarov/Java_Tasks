public class StudentTest {

    private static Student studentOne;
    private static Student studentTwo;
    public static void studentTest(){
        studentOne = new Student("John", "Bradley","Lawson",3,"IT",
                "Software","lawson@softuni.com", "01234567");
        studentTwo = new Student("Katie", "Ellys", "McWanden", 4,
                "Design", "Technical","k.e@technicaluni.com","08765432");
    }
    public static void testPrint(){
        System.out.println(studentOne);
        System.out.println(studentTwo);
    }
}

