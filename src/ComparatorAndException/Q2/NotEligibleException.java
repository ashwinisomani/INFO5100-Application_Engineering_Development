package ComparatorAndException.Q2;

public class NotEligibleException extends Exception {

    public NotEligibleException(){
        super("The age of the applicant is too early to apply for a driving license");
    }

    public NotEligibleException(String message) {
        super(message);
    }
}


