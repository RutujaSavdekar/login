package stude;
public class Student{
    private String name;
    private int rollNo;
    private int subject1;
    private int subject2;
    private int subject3;

    // Constructor
    public Student(String name, int rollNo, int subject1, int subject2, int subject3) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getSubject1() {
        return subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public double calculateAverage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }

    public int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    public static void main(String[] args) {
        // Create an array to store 3 students
        Student[] students = new Student[3];

        // Add students to the array with subject marks
        students[0] = new Student("Ram", 101, 85, 90, 78);
        students[1] = new Student("Shivam", 102, 92, 88, 76);
        students[2] = new Student("Sakshi", 103, 78, 85, 90);

        // Print individual student details including total and average
        for (Student student : students) {
            System.out.println("Name: " + student.getName() +
                               ", Roll No: " + student.getRollNo() +
                               ", Subject1: " + student.getSubject1() +
                               ", Subject2: " + student.getSubject2() +
                               ", Subject3: " + student.getSubject3() +
                               ", Total: " + student.calculateTotal() +
                               ", Average: " + student.calculateAverage());
        }
    }
}