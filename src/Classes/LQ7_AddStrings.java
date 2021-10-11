package Classes;

public class LQ7_AddStrings {
    public static void main(String[] args) {
        String nums1 ="11";
        String nums2 ="123";
        System.out.println("String1 = "+nums1);
        System.out.println("String2 = "+nums2);
        System.out.println("Output = "+addStrings(nums1,nums2));
        String nums11 ="456";
        String nums12 ="77";
        System.out.println("String1 = "+nums11);
        System.out.println("String2 = "+nums12);
        System.out.println("Output = "+addStrings(nums11,nums12));
        String nums21 ="0";
        String nums22 ="0";
        System.out.println("String1 = "+nums21);
        System.out.println("String2 = "+nums22);
        System.out.println("Output = "+addStrings(nums21,nums22));
    }
    public static String addStrings(String num1, String num2) {
        if(num1==null && num2==null)return new String();
        if(num1==null)return num2;
        if(num2==null)return num1;
        StringBuilder sb = new StringBuilder();
        int carry=0;
        int i=num1.length()-1,j=num2.length()-1 ;
        while(i>=0|| j>=0 || carry>0){
            int x = i>=0?num1.charAt(i)-'0':0;
            int y = j>=0?num2.charAt(j)-'0':0;

            sb.append((x+y+carry)%10);
            carry = (x+y+carry)/10;
            i--;
            j--;
        }
        return sb.reverse().toString();

    }
}
