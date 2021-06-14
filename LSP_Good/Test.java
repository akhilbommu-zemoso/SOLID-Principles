package LSP_Good;

public class Test{
    public static void main(String args){
        CseRelatedBranch cse = new CseStudent();
        cse.printDetails();
        cse.canCodeInJava();
        NonCseRelatedBranch non = new MechanicalStudent();
        non.printDetails();
        non.knowEngineeringGraphics();
    }
}
