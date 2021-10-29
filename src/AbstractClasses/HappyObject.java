package AbstractClasses;

public class HappyObject extends MoodyObject {

    //returns string indicating happy
    @Override
    String getMood() {
        return "happy";
    }

    //print laughter string
    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //returns message about self: “Subject laughs a lot”
    @Override
    public String tostring(){
        return "Subject laughs a lot";
    }
}