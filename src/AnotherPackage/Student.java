package AnotherPackage;

import static java.lang.System.*;

public class Student {
    public static int counter;

    {
        counter++;
    }

    private int age;
    private String name;
    private School school;

    {
        age = 25;
        name = "Ivan";
        School school = new School(237, "address");
    }

    static {
        System.out.println("static initializer");
    }


    public Student() {
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Student st = new Student(21, "Vasia");
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(Student.counter);
        Student st2 = new Student();
        System.out.println(st2.getName());
        System.out.println(st2.getAge());
        System.out.println(Student.counter);
        Student.m1();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public School getSchool() {
        return school;
    }


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(School school) {
        this(20, "Ivan");
        this.school = school;
    }

    static void m1() {
        int a = 10;
        System.out.println(a);
        Student st = new Student(18, "asd");
        System.out.println(st);
        m2(a, st);
        System.out.println(a);
        System.out.println(st);
    }

    static void m2(int i, Student student) {
        System.out.println(i);
        System.out.println(student);
        i = 100;
        System.out.println(i);
        student.setAge(123);
        System.out.println(student);
        student = new Student(20, "new name");
        System.out.println(student);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "age= " + age + "name= " + name;
    }
}

class School {
    private int number;
    private String address;

    public School(int number, String address) {
        this.number = number;
        this.address = address;
    }
}
