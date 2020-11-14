package linkedlists;

import java.util.*;
import java.lang.*; 
import java.io.*; 

class decodestr{
	 
	 public static String decode(String s) {
	Stack<String> g=new Stack<>();
	int length=s.length()-1;
	
	while(length>=0)
	{
		char ch=s.charAt(length);

		if(ch=='[')
		{ String str="";
			while(!(g.isEmpty()||g.peek().equals("]")))
			{
				str=str+g.pop();
			}
			if(g.peek().equals("]"))
			{
				g.pop();
			}
			
			g.push(str);
			
			
		}
		
		else if(ch>='0'&&ch<='9')
		{  	 
			
			String val1="";
			for(int i=length;i>=0;i--)
			{ 
				if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				{
					val1+=s.charAt(i);
				}
				else{
					break;
				}
			}
			
			String str=g.pop();
			String add="";
			for(int j=0;j<str.length();j++)
			{
				add+=str.charAt(j);
			}

			  String reverse = "";
		        
		        
		        for(int i = val1.length() - 1; i >= 0; i--)
		        {
		            reverse = reverse + val1.charAt(i);
		        }
			
		        int val=0;
		        if(!reverse.isEmpty())
		        {val=Integer.parseInt(reverse);}
		        
			for(int i=1;i<val;i++)
			{
				str+=add;
			}
			
			g.push(str);
			
		}
		
		else{
		
			g.push(ch+"");
			
			
		}
		
		
		length--;
	}
		 String result="";
		 while(!g.isEmpty())
		 {
			 result+=g.pop();
		 }
	return result;	 
		 
		 
	 }
	 
	 
	 //Dont make any changes here
	 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 System.out.println(decode(s));
	 }
	 
	 }
