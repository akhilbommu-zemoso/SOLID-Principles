package SRP_Good;

public class Driver {
    public static void main(String[] args){
        AddStudentToDB addStudent = new AddStudentToDB();
        addStudent.addStudentToDB();
        CalculatePercentage calcPercentage = new CalculatePercentage();
        calcPercentage.calculatePercentage();
        PrintStudentDetails psd = new PrintStudentDetails();
        psd.printStudentDetailsToConsole();
        psd.printStudentDetailsToExcel();
        psd.printStudentsOfComputerScienceBranch();
    }
}
