package OCP_Bad;

class Student{}
class CSEStudent extends Student{}
class ECEStudent extends Student{}

public class StudentInfo {
    private String name;
    private int student_id;
    private String branch;

    // Constructor, Getters and Setters

    public static void showCourses(Student s){
        if(s instanceof CSEStudent){
            System.out.println("These are CSE courses.");
        }
        if(s instanceof ECEStudent){
            System.out.println("These are ECE courses.");
        }
    }
    public static void main(String[] args){
        Student s = new CSEStudent();
        showCourses(s);
        s = new ECEStudent();
        showCourses(s);
    }
}
// If we want to add another subclass named EEEStudent, simply, we add one more if statement that
// violates the open-closed principle. The only way to add the subclass and achieve the goal of
// principle by overriding the showCourses() method.