
public class Sort5 
{
	
	public static void main(String[] args)
	{
		
		int row=3;
		
        for (int i=1; i<=(row * 2 -1); i++)
        {
            if( i == 3)
            {
                // Printing Horizontal Line of Stars
                for (int j=1; j<=(row * 2 -1); j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                // Printing space before Vertical Line of Stars
                for(int k=1; k<= row-1; k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	
	

}
