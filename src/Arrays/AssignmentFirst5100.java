package Arrays;

import java.util.Arrays;
import java.util.Arrays;

public class AssignmentFirst5100 {
    public static void main(String[] args) {
//  Input Arrays for sum of all unique elements
        int[] q1arr1  = {1,2,3,2};
        int[] q1arr2  = {1,1,1,1,1};
        int[] q1arr3  = {1,2,3,4,5};
//  Input Arrays for the squares of each number sorted in non-decreasing order
        int[] q2arr1 = {-4,-1,0,2,3};
        int[] q2arr2 = {-7,-3,2,3,11};


//  Input for first non-repeated integer in an array
        int[] q3arr1 = {2,3,4,2,2,3,5,7};

//  Input for each letter in magazine string can only be used in once in ransomnote
        String[] q4arr1={"a","b"};
        String[] q4arr2={"aa","ab"};
        String[] q4arr3={"aa","aab"};
        String q5arr1 = "1A3d4s5t";
        String q5arr2 = "A2bb2d4";

//  Print Output For Question First
        System.out.println("Assignment First Question 1");
        System.out.println("Output = "+sumOfnumbers(q1arr1));
        System.out.println("Output = "+sumOfnumbers(q1arr2));
        System.out.println("Output = "+sumOfnumbers(q1arr3));

//  Print Output for Question Second

        System.out.println("Assignment First Question 2");
        int[] result = sqtArray(q2arr1);
        System.out.println("Output = "+Arrays.toString(result));
        int[] result1 = sqtArray(q2arr2);
        System.out.println("Output = "+Arrays.toString(result1));

//  Print Output for Question Third
        System.out.println("Assignment First Question 3");
        System.out.println("Output=" +nonRepeating(q3arr1));


//  Print Output for Question Fourth
        System.out.println("Assignment First Question 4");
        System.out.println("Output = "+constructString(q4arr1[0],q4arr1[1]));
        System.out.println("Output = "+constructString(q4arr2[0],q4arr2[1]));
        System.out.println("Output = "+constructString(q4arr3[0],q4arr3[1]));

//  Print Output for Question Fifth
        System.out.println("Assignment First Question 5");
        System.out.println("Output = "+checkString(q5arr1));
        System.out.println("Output = "+checkString(q5arr2));

    }
    public static int sumOfnumbers(int[]arr){
        if(arr!=null && arr.length==0)return 0;
        System.out.println("Input Array ="+Arrays.toString(arr));
        int sum =0;
        int len = arr.length;
        for(int i =0;i<len;i++){
            sum =sum + arr[i];
            for(int j=0;j<len;j++){
                if(j!=i) {
                    if(arr[i]==arr[j]){
                        sum=sum-arr[i];
                        break;
                    }
                }
            }
        }
        return sum;
    }

    public static int nonRepeating(int []arr){
        System.out.println("Input = "+Arrays.toString(arr));
        if(arr!=null && arr.length==0)return 0;
        int sum =0;
        int len = arr.length;
        for(int i =0;i<len;i++){
            sum = arr[i];
            for(int j=0;j<len;j++){
                if(j!=i) {
                    if(arr[i]==arr[j]){
                        sum=Integer.MAX_VALUE;
                        break;
                    }
                }
            }
            if(sum!=Integer.MAX_VALUE) return sum;
        } return sum;
    }

    public static boolean checkString(String str){
        System.out.println("Input : "+str);
        if(str==null)return true;
        char c = str.charAt(0);
        boolean isNumeric = false;
        boolean isAlphabet = false;
        if(Character.isDigit(str.charAt(0))){
            isNumeric=true;
        }else
        {
            isAlphabet =true;
        }
        for(int i =1;i<str.length();i++){
            char st = str.charAt(i);
            if(isNumeric){
                if(Character.isDigit(st))return false;
                else if(Character.isAlphabetic(st)){
                    isAlphabet=true;
                    isNumeric =false;
                }
            }else if(isAlphabet){
                if(Character.isAlphabetic(st))return false;
                else if(Character.isDigit(st)){
                    isAlphabet=false;
                    isNumeric =true;
                }
            }
        }
        return true;
    }
    public static int[] sqtArray(int[]arr){
        System.out.println("Input = "+Arrays.toString(arr));
        int res[] = new int[arr.length];
        // constructing a array with square
        for(int i=0;i<arr.length;i++){
            res[i] = arr[i]*arr[i];
        }
        Arrays.sort(res);
        return res;
    }
    public static boolean constructString(String ransomNote, String magazine){
        System.out.println("Input : ransomNote = "+ransomNote +", magazine = "+magazine);
        int[] arr = new int[256];
        for(int i=0;i<magazine.length();i++){
            char temp = magazine.charAt(i);
            arr[temp-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char tempR = ransomNote.charAt(i);
            if(arr[tempR-'a']>0){
                arr[tempR-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}
