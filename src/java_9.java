import java.util.*;
public class java_9 {

	public static int[] removeElements(int[] arr, int key)
    {
          // Move all other elements to beginning 
          int index = 0;
          for (int i=0; i<arr.length; i++)
             if (arr[i] != key)
                arr[index++] = arr[i];
  
         // Create a copy of arr[] 
         return Arrays.copyOf(arr, index);
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	
		int val[];
		
		int input;
		int v=3;
		int test;
		int l;
		Scanner scan= new Scanner(System.in);
		input=scan.nextInt();
		
		String temp = Integer.toString(input);
		int[] numbers = new int[temp.length()];
		
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		
		} 
		
	
			l=numbers.length;
			System.out.println("L"+l);
			
			int[] num= new int[l];
        num=removeElements(numbers, v);
        String[] exceptionNum=new String[l];
        
        for(int i=0;i<exceptionNum.length;i++)
        {
        	 exceptionNum[i]=" ";
        }
        
        for(int i=0;i<num.length;i++)
        {
        	 exceptionNum[i]=String.valueOf(num[i]);
        }
        System.out.println("Resultant Array: "
                + Arrays.toString(exceptionNum));
		
	}

}
