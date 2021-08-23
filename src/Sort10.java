
public class Sort10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int rows=5;
		for (int m=rows; m>=1; m--)
		{
		for (int n=1; n<=(m * 2) -1; n++)
		{
		System.out.print("*");
		}
		System.out.println();
		for (int p=rows; p>=m; p--)
		{
		System.out.print(" ");
		}
		}

	}

}
