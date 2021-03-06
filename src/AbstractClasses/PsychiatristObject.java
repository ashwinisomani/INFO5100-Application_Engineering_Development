package AbstractClasses;

public class PsychiatristObject {
    //asks moody object about its mood
    public void examine(MoodyObject moodyObject){
        System.out.println("How are you feeling today?");
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(MoodyObject moodyObject){
        System.out.println("Observation:" + moodyObject.tostring());
    }


}