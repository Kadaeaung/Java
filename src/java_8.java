import java.util.*;
public class java_8 {

	public static void main(String[] args)
	{
		
		
		int output=0;
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Index");
		input=scan.nextInt();
		int result,t,value=0,m=100,d=0,index=0;
		int[] num= new int[input];
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=scan.nextInt();
		}
		System.out.println("Value");
		value=scan.nextInt();
		for(int i=0;i<num.length;i++)
		{
			t=num[i];
			if(t==value)
			{
			
				index=i;
			}
			else if(t>0)
			{
				
		         if(t<value)
		         {
		        	 d=value-t;
		        	 
		        	  if(m>d)
				         {
		        		  
		        		  System.out.println("value"+d);
		        		 
				        	m=d;
				        	index=i+1;
				        	System.out.println("Index"+index);
				        	System.out.println("m"+m);
				         }
		         }
		         else if(t>value)
		         {
		        	 d=t-value;
		        	 
		        	  if(m>d)
				         {
		        		  System.out.println("t"+d);
				        	m=d;
				        	index=i-1;
				        	System.out.println("m"+m);
				         }
		         }
		            
		         
		        				
			}
		}
		
	
		if(index>0)
		{
		System.out.println("index"+index);
		}
		
		System.out.println(index);
    }
	
	
}
