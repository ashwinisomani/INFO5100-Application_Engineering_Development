package FinalExam5100.Q3;

public class SubArraySumEqual {
    public static void main(String[] args) {
        int [] input1 = {1,1,1} ;
        int k1= 2;
        int res1 = continuousSubarraySum(input1, k1);
        System.out.println(res1);
        int [] input2 = {1,2,3} ;
        int k2= 3;
        int res2 = continuousSubarraySum(input2, k2);
        System.out.println(res2);
    }
    public static int continuousSubarraySum(int[] nums, int k) {
        int result =0;

        for(int i=0;i<nums.length;i++){
            int curr_sum =0;
            for(int j =i;j<nums.length;j++){
                curr_sum +=nums[j];
                if(curr_sum==k) result++;

            }

        }
        return result;
    }
}
