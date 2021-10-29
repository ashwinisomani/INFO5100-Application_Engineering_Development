package AbstractClasses;

abstract class MoodyObject {
    // Return the mood : sad or happy
    abstract String getMood();
    // Each Object expresses a different motion
    abstract void ExpressFeelings();
    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public void queryMood(){
        System.out.println("I feel " + getMood() + " Today.");
    }


    abstract String tostring();
}