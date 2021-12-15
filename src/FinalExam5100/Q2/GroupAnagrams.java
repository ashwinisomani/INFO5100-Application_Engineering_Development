package FinalExam5100.Q2;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] input1 =  {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams(input1);
        System.out.println(lists);
        String [] input2 =  {""};
        List<List<String>> lists2 = groupAnagrams(input2);
        System.out.println(lists2);
        String [] input3 =  {"a"};
        List<List<String>> lists3 = groupAnagrams(input3);
        System.out.println(lists3);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}

