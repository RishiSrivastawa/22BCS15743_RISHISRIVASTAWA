import java.util.Scanner;
  abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();
}

   class Student extends Person {
    int rollNumber;
    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}


public class StudentsInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add Student:");
        System.out.print("Name: ");
        String studentName = sc.nextLine();

        System.out.print("Age: ");
        int studentAge = sc.nextInt();

        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        Student student = new Student(studentName, studentAge, rollNumber);

        System.out.println("\nAdd Teacher:");
        System.out.print("Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Age: ");
        int teacherAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);


        System.out.println();
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();

    }
}
