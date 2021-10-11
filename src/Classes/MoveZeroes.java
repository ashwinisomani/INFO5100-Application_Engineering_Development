package Classes;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        System.out.print("Input = ");
        for(int i:nums)System.out.print(i+",");
        System.out.println();
                moveZeroes(nums);
                System.out.print("Output = ");
                for(int i:nums)System.out.print(i+",");
                System.out.println();
        int[] nums1 ={0};
        System.out.print("Input = ");
        for(int i:nums1)System.out.print(i+",");
        System.out.println();
                moveZeroes(nums1);
                System.out.print("Output = ");
                for(int i:nums1)System.out.print(i+",");

    }
    public static void moveZeroes(int[] nums) {
        int begin =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[begin] =nums[i];
                begin++;
            }
        }
        for(int i=begin;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
