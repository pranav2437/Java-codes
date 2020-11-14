package linkedlists;
import java.util.Scanner;
  
  public class  mustang{
  
  	 public static int mustangTour(int[] petrol,int[] dist){
	
		 int i=0;
		 int j=0;
		 int spare =0;
		 boolean flag=false;
		 while(true)
		 {  int startpoint=i;
			 
			 if(spare>=0)
			 {
				 if(i==j&&flag==true)
				 {
					 return startpoint;
				 }
				 else
				 {
					 
					 spare=spare+petrol[j]-dist[j];
					 j=(j+1)%(petrol.length);
					 
					 flag=true;
				 }
			 }
			 else{
				 if(j<i&&spare<0)
				 {
					 return -1;
				 }
				 else{
					 i=j;
					 flag=false;
					 spare=0;
				 }
				 
			 }
			 
			
			 	 if(j<=i&&spare<0)
			 {
				 
				 //System.out.println(i+" "+j);
				 return -1;
			 }
		 }
		 		 
		 
	 }

  
  
  
  
  
  	  // Dont make changes here
  	  public static void main(String[] args) {
  	  	  Scanner sc=new Scanner(System.in);
  	  	  int n=sc.nextInt();
  	  	  int[] petrol=new int[n];int[] dist=new int[n];
  	  	  for(int i=0;i<n;i++)petrol[i]=sc.nextInt();
  	  	  for(int i=0;i<n;i++)dist[i]=sc.nextInt();
  	  	  System.out.println(mustangTour(petrol,dist));
  	  }
  
  
  
  }