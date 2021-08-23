
public class Sort9 {
	public static void main(String[] args)
	
	  
	{

		int rows=6;
		
		 for (int i=1; i<=rows; i++)
	        {
	            for (int j=1; j<=i; j++)
	            {
	                if(i<=j)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        	}
	
	}
}
