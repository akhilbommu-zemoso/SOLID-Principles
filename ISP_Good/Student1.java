package ISP_Good;

public class Student1 implements JoinedViaMains,GeneralInterface{
    @Override
    public void joinedViaMains() {
        System.out.println("Joined Via Mains");
    }

    @Override
    public void collegeFee() {
        System.out.println("College Fee is 80000 INR");
    }

    @Override
    public void examinationFee() {
        System.out.println("College Fee is 1000 INR");
    }
}

class Driver{
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.joinedViaMains();
        s1.collegeFee();
        s1.examinationFee();
    }
}
