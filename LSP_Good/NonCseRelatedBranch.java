package LSP_Good;

public class NonCseRelatedBranch extends Student{
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void knowEngineeringGraphics(){
        System.out.println("Non CSE Student knows Engineering Graphics");
    }
}
