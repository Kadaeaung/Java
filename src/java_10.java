import java.util.*;
public class java_10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
	
		int input;
		int v=0;
		int j=0;
		int index;
		String con="";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Index");
        index= scan.nextInt();
        int[] numbers= new int[index];
       for(int i=0;i<index;i++)
        {
            numbers[i]=scan.nextInt();
          
           
        }
		
	
       

       
		for(int i=0;i<numbers.length;i++)
		{
					 v=v+numbers[i];
		 
			
		}
		
	
		System.out.println(v);
		
        
	}

}
