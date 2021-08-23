
public class Sort13 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int c=5;
		for(int i=1 ;i<=c*2-1 ;i++)
		{
			for(int j=1 ;j<=c ;j++)
			{
            
				if(i==j||j==c-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}

}
