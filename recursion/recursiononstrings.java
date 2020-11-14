package recursion;
import java.util.*;

public class recursiononstrings {

	
	
	static String[] codes = {".","abc","def","ghi","jklm","no","pqrs","tu","vwxy","z"};
	
	public static ArrayList<String> subsequences(String s){
		if(s.length()==0){
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = s.charAt(0);
		String str =  s.substring(1,s.length());
		ArrayList<String> ans = subsequences(str);
		ArrayList<String> res = new ArrayList<>();
		for(int i=0;i<ans.size();i++) {
			String s1 = ans.get(i);
			res.add("-" + s1);
			res.add(ch + s1);
		}
		return res;
		
	}
	
	public static ArrayList<String> getkp(String str){
		if(str.length()==0) {
			ArrayList<String> list =  new ArrayList<>();
			list.add("");
			return list;
		}
		int val = Character.getNumericValue(str.charAt(0));
		ArrayList<String> ans = getkp(str.substring(1, str.length()));
		ArrayList<String> res = new ArrayList<>();
		for(int i=0;i<ans.size();i++) {
			String s1 = ans.get(i);
			String s2 = codes[val];
			for(int j=0;j<s2.length();j++) {
				res.add(s2.charAt(j)+s1);
			}
		}
		return res;
	}
				
	public static ArrayList<String> getstairpath(int n){        //can jump 1 or 2 or 3 stair at a time
		                                                        //return all possible paths to come down from nth stair
		if(n==0) {
			ArrayList<String> l = new ArrayList<>();
			l.add("");
			return l;
		}
		
		ArrayList<String> res = new ArrayList<>();
		for(int i=1;i<=3;i++) {
			int n1 = n-i;
			ArrayList<String> ans = getstairpath(n1);
			for(int j=0;j<ans.size();j++) {
				String str = ans.get(j);
				String s = i+str;
				res.add(s);
			}
		}
		return res;
	}
		
	
	public static void main(String[] args) {
		ArrayList<String> list = subsequences("abcd");
		//System.out.println(list);
		ArrayList<String> list2 = getkp("835");
		//System.out.println(list2);
		ArrayList<String> list3 = getstairpath(4);
		System.out.println(list3);
	}
}
