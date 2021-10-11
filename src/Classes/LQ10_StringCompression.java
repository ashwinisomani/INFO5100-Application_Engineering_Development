package Classes;

public class LQ10_StringCompression {
    public static void main(String[] args) {
        char [] chars = {'a','a','b','b','c','c','c'};
        System.out.print("Input = ");
        for(char c:chars)System.out.print(c+",");
        System.out.println();
        System.out.println("Output = "+compress(chars));
        char [] chars1 = {'a'};
        System.out.print("Input = ");
        for(char c:chars1)System.out.print(c+",");
        System.out.println();
        System.out.println("Output = "+compress(chars1));

        char [] chars2 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.print("Input = ");
        for(char c:chars2)System.out.print(c+",");
        System.out.println();
        System.out.println("Output = "+compress(chars2));

        char [] chars3 = {'a','a','a','b','b','a','a'};
        System.out.print("Input = ");
        for(char c:chars3)System.out.print(c+",");
        System.out.println();
        System.out.println("Output = "+compress(chars3));

    }
    public static int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
}
