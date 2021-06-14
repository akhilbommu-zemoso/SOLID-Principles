package LSP_Good;

public class CseRelatedBranch extends Student{
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void canCodeInJava(){
        System.out.println("CSE Related Student has knowledge in Java");
    }
}
