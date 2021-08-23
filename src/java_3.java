import java.util.*;
public class java_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum=0,temp;    
		  int n;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter Number");
		  n=input.nextInt();
		  
		  temp=n;    
		  while(n<0 || n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  
		  if(temp==sum) 
		  {
			  if(sum>0)
			  {
				  System.out.println("True");
			  }
			  else if(sum<0) 
			  {
				  System.out.println("False");

			  }
				  
		     
		  }
		  else    
		   System.out.println("not palindrome");    
		   
		
		
		 	
	}

}
