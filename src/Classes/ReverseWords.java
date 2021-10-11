package Classes;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println("Input = "+s);
        System.out.println("Output = "+reverseWords(s));
      String s1 = "  hello world  ";
        System.out.println("Input = "+s1);
        System.out.println("Output = "+reverseWords(s1));
      String s2 = "a good   example";
        System.out.println("Input = "+s2);
        System.out.println("Output = "+reverseWords(s2));
     String s3 = "  Bob    Loves  Alice   ";
        System.out.println("Input = "+s3);
        System.out.println("Output = "+reverseWords(s3));
     String s4 = "Alice does not even like bob";
        System.out.println("Input = "+s4);
        System.out.println("Output = "+reverseWords(s4));
    }
    public static String reverseWords(String s) {

        s= s.trim();
        s = replaceSpace(s);
        int i=0,j=0;

        char[]strchar = s.toCharArray();
        reverse(strchar,0,strchar.length-1);


        while(i<strchar.length-1 ){
            if(strchar[i]==' ' && strchar[i-1]!=' '){


                reverse(strchar,j,i-1);
                j=i+1;
            }
            i++;

        }
        reverse(strchar,j,strchar.length-1);

        return new String(strchar);
    }

    public static void reverse(char[] strchar, int i, int j){
        while(i<=j){
            char temp = strchar[i];
            strchar[i]= strchar[j];
            strchar[j]=temp;
            i++;
            j--;

        }
    }

    public static String replaceSpace(String str){
        if(str ==null || str.length()<2)return str;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i-1)==' ')continue;
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
