import java.util.Scanner;
public class Java_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	
		int target;
		int index;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Array Index");
		index=input.nextInt();
	
	    int nums[]= new int[index];
		
	    //Array Input
		for(int i=0;i<nums.length;i++)
		{
			System.out.println("Enter Array Index "+(i+1)+" value");

			nums[i]=input.nextInt();
		}

		//Array output display
		for(int i=0;i<nums.length;i++)
		{
			System.out.println("Array Index "+(i+1)+" value");
			System.out.println(nums[i]);
		}
		
		System.out.println("Enter target value");
		target=input.nextInt();
		
		
		for(int i=0;i<nums.length;i++)
		{
			
			for(int j=0;j<nums.length;j++)
			{
				
				if(target==nums[i]+nums[j] && i!=j)
				{
					if(j<=i)
					System.out.println("["+j+"]"+","+"["+i+"]");
					
					break;
					
				}
				
				
				
			}
			
			
			
		}
	}

}
