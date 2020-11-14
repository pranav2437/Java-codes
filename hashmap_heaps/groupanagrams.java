package hashmap_heaps;

import java.util.*;

public class groupanagrams {

    // This is a functional problem. You have to complete this function.
    // It takes as input an array of Strings. It should return a list of list of strings
    // with anagrams grouped together.

    public static List<List<String>> groupAnagrams(String[] strs) {
        // write your code here.
    	HashMap<String,ArrayList<String>> map = new HashMap<>();
    	for(int i=0;i<strs.length;i++) {
    		
    		char[] s = strs[i].toCharArray();
    		Arrays.sort(s);
    		String st = new String(s);
    		if(!map.containsKey(st)) {
    			ArrayList<String> list = new ArrayList<>();
    			list.add(strs[i]);
    			map.put(st,list);
    		}
    		else {
    			ArrayList<String> list = map.get(st);
    			list.add(strs[i]);
    			map.put(st, list);
    		}
    	}
    	List<List<String>> l = new ArrayList<>();
    	for(String k:map.keySet()) {
    		List<String> l1 = map.get(k);
    		l.add(l1);    		
    	}
    	return l;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Length of the array
        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        List<List<String>> anagramsGrouped = groupAnagrams(arr);

        for (List<String> lst : anagramsGrouped) {
            Collections.sort(lst);
        }

        anagramsGrouped.sort(new ListComparator());

        display(anagramsGrouped);

    }

    // Comparator for sorting the result list.
    static class ListComparator implements Comparator<List<String>> {

        @Override
        public int compare(List<String> l1, List<String> l2) {

            if (l1.size() != l2.size()) {
                return l2.size() - l1.size();
            }

            for (int i = 0; i < l1.size(); i++) {
                String l1str = l1.get(i);
                String l2str = l2.get(i);

                return l1str.compareTo(l2str);

            }

            return 0;

        }
    }

    // Function to display a List of Lists of strings.
    public static void display(List<List<String>> list) {

        for (int i = 0; i < list.size(); i++) {

            List<String> currList = list.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }

    }

}
