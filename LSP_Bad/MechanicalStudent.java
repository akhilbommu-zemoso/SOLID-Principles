package LSP_Bad;

public class MechanicalStudent extends Student{
    // This class cannot extend Student class because canCodeInJava() is not mandatory to Mechanical Student.
    @Override
    public void canCodeInJava(){
        // Can't implement because Mechanical Student does not have Java Knowledge.
    }
}
