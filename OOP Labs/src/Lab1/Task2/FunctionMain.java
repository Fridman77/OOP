package Lab1.Task2;

public class FunctionMain {
    public static void main(String[] args) {
        Univer UTM =new Univer("UTM", 1990);
        Student StudentUTM1 =new Student("Jora","Ivan", 33, 10, "UTM");
        Student StudentUTM2 =new Student("Ion","Ivan", 32, 9, "UTM");
        Student StudentUTM3 =new Student("Ana","Ivan", 22, 10, "UTM");

        Univer USM =new Univer("USM", 1995);
        Student StudentUSM1 =new Student("Cristian","Ivan", 18, 10, "UTM");
        Student StudentUSM2 =new Student("Ioana","Ivan", 19, 5, "UTM");
        Student StudentUSM3 =new Student("Maria","Ivan", 21, 7, "UTM");

        Univer ASEM =new Univer("ASEM", 1999);
        Student StudentASEM1 =new Student("Ilie","Ivan", 27, 7, "UTM");
        Student StudentASEM2 =new Student("Sorina","Ivan", 25, 7, "UTM");
        Student StudentASEM3 =new Student("Valeria","Ivan", 29, 5, "UTM");
    }

}

