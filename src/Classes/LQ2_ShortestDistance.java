package Classes;

public class LQ2_ShortestDistance {
    public static void main(String[] args) {
        String[] wordDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 ="coding";
        String word2="practice";
        System.out.println("First input word1 = "+word1 +" word2 = "+word2);
      System.out.println("Output = " +shortestDistance(wordDict,word1,word2));
        String word11 ="makes";
        String word21="coding";

      System.out.println("Second input word1 = "+word11 +" word2 = "+word21);
      System.out.println("Output = " +shortestDistance(wordDict,word11,word21));
    }
    public static int shortestDistance(String[] words, String word1, String word2) {
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(word2)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j));
                    }
                }
            }
        }
        return minDistance;
    }
}
