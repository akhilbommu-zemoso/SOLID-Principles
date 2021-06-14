package DIP_Good;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Teacher> l;
    Student(List<Teacher> l){
        this.l = l;
    }

    public void print(){
        for(int i=0;i<l.size();i++){
            l.get(i).teach();
        }
    }
}

class Test{
    public static void main(String[] args){
        List<Teacher> l = new ArrayList<Teacher>();
        l.add(new PythonTeacher());
        l.add(new JavaTeacher());
        l.add(new CppTeacher());
        new Student(l).print();
    }
}