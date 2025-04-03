package ObjectOverLoadingProcess;

public class Student extends Person {
    private int studentId;

    Student(int id, String name, int age) { 
        super(name, age);  // Calling Person's constructor
        this.studentId = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void displayDetails() {
        System.out.println(this.getStudentId());
        displayParentDetails();  // Uses the corrected method from Person
    }
}
