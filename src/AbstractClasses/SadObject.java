package AbstractClasses;
public class SadObject extends MoodyObject {
    @Override
    String getMood() {
        return "sad";
    }
    //print crying string
    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob' ");

    }
    //returns message about self : “Subject cries a lot”
    @Override
    public String tostring(){
        return "Subject cries a lot ";
    }
}
