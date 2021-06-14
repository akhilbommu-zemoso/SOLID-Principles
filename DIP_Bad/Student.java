package DIP_Bad;

public class Student {
    private JavaTeacher jt;
    private CppTeacher cppt;
    // private PythonTeacher pt;
    Student(JavaTeacher jt,CppTeacher cppt){
        this.jt = jt;
        this.cppt = cppt;
    }

    public void print(){
        jt.teach();
        cppt.teach();
    }
}

class Test{
    public static void main(String[] args){
        CppTeacher cppt = new CppTeacher();
        JavaTeacher jt = new JavaTeacher();
        new Student(jt,cppt).print();
    }
}

// If we want to add Python Teacher, then we have to modify the Student Class which is tedious and
// this violates the Dependency Inversion Principle.