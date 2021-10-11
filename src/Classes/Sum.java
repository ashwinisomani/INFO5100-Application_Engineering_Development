package Classes;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
         System.out.println(sum.add(4, 5.0));//output : 9.0
         System.out.println(sum.add(15.5, 5));//output : 20.5
         System.out.println(sum.add(1.0, 6.4));//output : 7.4

    }

    public Float add(Float inp1 , Float inp2 ){
        return inp1 + inp2;
    }

    public Double add(Double inp1, Double inp2) {
        return inp1 + inp2;
    }

    public int add(int inp1, int inp2) {
        return inp1 + inp2;
    }
    public float add(Float inp1 , Integer inp2){
        return inp1 + inp2;
    }
    public Integer add(Integer inp1 , Integer inp2 , Integer inp3){
        return inp1 + inp2 + inp3;
    }
    public Double add(Integer inp1 , Double inp2){
        return inp1 + inp2;
    }

    public double add(double inp1, int inp2) {
        return inp1 + inp2;
    }
}
