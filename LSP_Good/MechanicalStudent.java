package LSP_Good;

public class MechanicalStudent extends NonCseRelatedBranch{
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public void knowEngineeringGraphics(){
        System.out.println("Can solve Engineering Graphics Problems");
    }
}

