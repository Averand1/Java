package Classes;

public class Student extends Human {
    String year;
    String Branch;
    public Student(int age, String name, String occupation) {
        super(age, name, occupation);
    }

    public void BranchAndYear(String Branch, String year) {
        this.Branch = Branch;
        this.year = year;
    }

    public void getStudentAge() {
        System.out.println("Student's age is "+this.age);
    }
    public void getStudentName() {
        System.out.println("Student's name is "+this.name);
    }
    public void getStudentYear() {
        System.out.println("Student's age is "+ this.year);
    }
    public void getStudentBranch() {
        System.out.println("Student's Branch is "+this.Branch);
    }

    

    
}