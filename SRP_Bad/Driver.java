package SRP_Bad;

public class Driver {
    public static void main(String[] args){
        Student s = new Student();
        s.addStudentToDB();
        s.calculatePercentage();
        s.printStudentDetailsToConsole();
        s.printStudentDetailsToExcel();
        s.printStudentsOfComputerScienceBranch();
    }
}
