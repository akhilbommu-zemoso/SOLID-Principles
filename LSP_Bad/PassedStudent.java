package LSP_Bad;

public class PassedStudent extends Student{
    public int points = 220;

    @Override
    public void setPassed(boolean isPassed){
        if (isPassed){
            System.out.println("Student Passed with : " + points/24);
        }
    }
}
