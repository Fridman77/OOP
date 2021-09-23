package Lab1.Task1;

public class Student {
    //Private default protected public
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName ,String lastName ,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void info() {
        System.out.println(firstName + " " + lastName + " " + age);
    }
    public void hello() {
        System.out.println(firstName+":Hello!");
    }
                        };
