package LSP_Bad;

public class Student {
    private String name;
    private String student_id;
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Name: "+this.name+" Student ID: "+this.student_id+" Branch: "+this.branch);
    }

    public void canCodeInJava(){
        System.out.println("This Student can code in Java");
    }
}
