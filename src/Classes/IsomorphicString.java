package Classes;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 ="egg";
        String s2 ="add";
        System.out.println("String 1 ="+s1);
        System.out.println("String 2 ="+s2);
        System.out.println("Output = "+isIsomorphic(s1,s2));
        String s11 ="foo";
        String s21 ="bar";
        System.out.println("String 1 ="+s11);
        System.out.println("String 2 ="+s21);
        System.out.println("Output = "+isIsomorphic(s11,s21));

        String s12 ="paper";
        String s22 ="title";
        System.out.println("String 1 ="+s12);
        System.out.println("String 2 ="+s22);
        System.out.println("Output = "+isIsomorphic(s12,s22));

    }
    public static boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
    }
}
