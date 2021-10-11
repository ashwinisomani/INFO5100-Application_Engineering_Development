package Classes;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println("Output = "+isPalindrome(s));
    String s1="race a car";
        System.out.println("Output = "+isPalindrome(s1));
    }
    public static boolean isPalindrome(String s) {
        if(s ==null || s.length()==0 || s.length()==1)return true;
        int i =0;
        int j= s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))j--;
            if((Character.toUpperCase(s.charAt(i)))!=(Character.toUpperCase(s.charAt(j))))return false;
            i++;
            j--;
        }
        return true;
    }
}
