
public class Sort12 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int rows=5;
		 for (int i=1; i<rows; i++)
	        {
	            for (int j=1; j<=rows; j++)
	            {
	                if(i+j==rows)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        	}

	}

}
