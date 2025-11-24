import java.util.Scanner;

public class student {

    private String name;
    private int age;
    private String course;
    private String studentId;

    public student() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Course: ");
        course = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        studentId = scanner.nextLine();
    }

    public void displayStudentInfo() {
        System.out.println("\n----- Student Information -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        student stud = new student();
        stud.inputStudentInfo();
        stud.displayStudentInfo();
    }
}