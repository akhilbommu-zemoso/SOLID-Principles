package ISP_Bad;

public interface StudentAdmission {
    void joinedViaEamcet();
    void joinedViaMains();
    void joinedViaManagementSeat();
    int collegeFee();
    int examinationFee();
}

// Suppose a Student admitted a college through Eamcet, now this class(EamcetStudent) cannot implement
// joinedViaMains() and joinedViaManagementSeat() methods. So if this class implements these two methods.
// Then this class violates Interface Segregation Principle.