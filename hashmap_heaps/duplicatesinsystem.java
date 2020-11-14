package hashmap_heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class duplicatesinsystem {
	 	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input the head of the linked list.
	 // It should return the head of the modified list.

	 public static ArrayList<ArrayList<String>> findDuplicate(String[] paths) {

	 	 // write your code here
		 HashMap<String,Integer> H = new HashMap<>();
		 ArrayList<ArrayList<String>> result = new ArrayList<>();
		 
		 int index = 0;
		 
		 for(int k=0 ; k<paths.length ; k++)
		 {
			 String path = paths[k];
			 
			 Stack<Character> S = new Stack<>();
			 boolean isSpace = false;
			 
			 for(int i=0 ; i<path.length() ; i++)
			 {
				 char ch = path.charAt(i);
				 
				 if(ch==' ')
				 {
					if(!isSpace)
					{
						S.push(ch);
						isSpace = true;
					}
					else
					{
						while(!S.empty() && S.peek()!=' ')
						{
							S.pop();
						}
						if(!S.empty())
						{
							S.pop();
						}
						S.push(ch);
					}
				 }
				 else if(ch==')')
				 {
					 String key = "";
					 
					 while(!S.empty() && S.peek()!='(')
					 {
						 char temp = S.pop();
						 key = temp+key;
					 }
					 S.pop();
					
					 String value = "";
					 
					 Stack<Character> S2 = new Stack<>();
					 
					 while(!S.empty())
					 {
						 char temp = S.pop();
						 
						 if(temp==' ')
						 {
							 value = '/' + value;
						 }
						 else
						 {
							 value = temp + value;
						 }
						 
						 S2.push(temp);
					 }
					 
					 while(!S2.empty())
					 {
						 S.push(S2.pop());
					 }
					 
					 if(!H.containsKey(key))
					 {
						 ArrayList<String> arr = new ArrayList<>();
						 arr.add(value);
						 H.put(key,index);
						 result.add(index,arr);
						 index++;
					 }
					 else
					 {
						 int ourIndex = H.get(key);
						 ArrayList<String> arr = result.get(ourIndex);
						 arr.add(value);
						 result.set(ourIndex,arr);
					 }
				 }
				 else
				 {
					 S.push(ch);
				 }
			 }
		 }
		 
		 ArrayList<String> arr = new ArrayList<String>();
		 
		 for(String str : H.keySet())
		 {
			 arr.add(str);
		 }
		 
		 Collections.sort(arr);
		 
		 ArrayList<ArrayList<String>> finalResult = new ArrayList<>();
		 
		 for(int i=0 ; i<arr.size() ; i++)
		 {
			 String key = arr.get(i);
			 int temp = H.get(key);
			 ArrayList<String> toAdd = result.get(temp);
			 finalResult.add(i,toAdd);
		 }
		 
		 return finalResult;

	 }

	 // -----------------------------------------------------

	 public static void main(String[] args) throws NumberFormatException, IOException {
	 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	 int n = Integer.parseInt(br.readLine());
	 	 String[] paths = new String[n];

	 	 for (int i = 0; i < n; i++) {
	 	 	 paths[i] = br.readLine();
	 	 }
	 	 ArrayList<ArrayList<String>> ans = findDuplicate(paths);
	 	 for (ArrayList<String> val : ans) {
	 	 	 Collections.sort(val);
	 	 }

	 	 for (ArrayList<String> val : ans) {
	 	 	 System.out.println(val);
	 	 }
	 }
}
