import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] frq = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                frq[ch - 'a'] = frq[ch - 'a'] + 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < frq.length; j++) {
                sb.append(frq[j]+" ");
            }
            String s= sb.toString();
            if (!map.containsKey(s))
                map.put(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        List<List<String>> list= new ArrayList<>();
        list.addAll(map.values());
//        for (String key: map.keySet()) {
//            list.add(map.get(key));
//        }
        return list;
    }
}

