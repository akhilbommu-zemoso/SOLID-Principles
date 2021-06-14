package LSP_Good;

public class CseStudent extends CseRelatedBranch{
    private String branch;

    public String getBranch() {
        return branch;
    }

    @Override
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public void canCodeInJava(){
        System.out.println("CSE Student can code in Java");
    }
}
