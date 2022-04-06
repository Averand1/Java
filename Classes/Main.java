package Classes;
public class Main {
    public static void main(String[] args) {
        Student MyStudent = new Student(22, "Bob", "Student");
        MyStudent.BranchAndYear("IT", "2nd");
        MyStudent.getStudentAge();
        MyStudent.getStudentBranch();
        MyStudent.getStudentName();
        MyStudent.getStudentYear();

        
    }
}