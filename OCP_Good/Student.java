package OCP_Good;

public class Student{
    private String name;
    private int student_id;
    private String branch;

    // Constructor, Getters and Setters

    public void showCourses(){
        System.out.println("Common Courses");
    }
}

class CSEStudent extends Student{
    @Override
    public void showCourses(){
        System.out.println("These are CSE Courses");
    }
}

class ECEStudent extends Student{
    @Override
    public void showCourses(){
        System.out.println("These are ECE Courses");
    }
}

class EEEStudent extends Student{
    @Override
    public void showCourses(){
        System.out.println("These are EEE Courses");
    }
}

class Driver{
    public static void main(String[] args){
        Student s = new CSEStudent();
        s.showCourses();
        s = new ECEStudent();
        s.showCourses();
        s = new EEEStudent();
        s.showCourses();
    }
}