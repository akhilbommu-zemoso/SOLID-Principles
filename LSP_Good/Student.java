package LSP_Good;

public class Student {
    private String name;
    private String student_id;

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
        System.out.println("Name: "+this.name + " Student ID: "+this.student_id);
    }
}
