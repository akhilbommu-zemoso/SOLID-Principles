package SRP_Bad;

public class Student {
    private String name;
    private int student_id;
    private String branch;
    public int[] marks;

    // Constructor, Getters and Setters

    public void addStudentToDB(){
        System.out.println("New Student added to DB.");
    }

    public void calculatePercentage(){
        System.out.println("Student Percentage is calculated here.");
    }

    public void printStudentDetailsToConsole(){
        System.out.println("Students Details are printed to console");
    }

    public void printStudentDetailsToExcel(){
        System.out.println("Students Details in Excel Sheet.");
    }

    public void printStudentsOfComputerScienceBranch(){
        System.out.println("Computer Science Branch Students.");
    }
}

