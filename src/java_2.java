import java.util.*;
public class java_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num;
		Scanner input = new Scanner(System.in);
		
		num=input.nextInt();
		if(num>=-2147483648 && num<=2147483647)
		{
			int reverse=0;
			for( ;num != 0; num=num/10)   
			{  
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
						
			}  			
			System.out.println(reverse);

		}
		else
		{
			System.out.println("Try again");
		}
	}

}
