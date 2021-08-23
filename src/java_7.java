import java.util.*;
public class java_7 {

	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int removedu[];
		
		int k;
		int input;
		int tep=0;
		
		Scanner scan= new Scanner(System.in);
		input=scan.nextInt();
		
		String temp = Integer.toString(input);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		
		} 
			k=temp.length();
		
		
//		  for (int i = 0; i < numbers.length; i++) 
//		  {     
//	            for (int j = i+1; j <numbers.length; j++)
//	            {     
//	               if(numbers[i] > numbers[j]) {    
//	                   tep = numbers[i];    
//	                   numbers[i] = numbers[j];    
//	                   numbers[j] = tep;    
//	               }     
//	            }     
//		  }
		
		
		  
		 		  
		  Arrays.sort(numbers);//sorting array  
	        int length = numbers.length;  
	        length = removeDuplicateElements(numbers, length); 
	        String[] realnum=new String[k];
	        //printing array elements  
//	        for (int i=0; i<length; i++)  
//	           System.out.print(numbers[i]+" ");  
 
	        
	        for(int i=0;i<k;i++)
	        {
	        	
	        	realnum[i]=" ";
	        }

        
	        for(int i=0;i<length;i++)
	        {
	        	String nn=String.valueOf(numbers[i]);
	        	
	        	realnum[i]=nn;
	        }
		
	        for (int i=0; i<realnum.length; i++)  
		           System.out.print("{"+realnum[i]+"}"+",");
	        	   System.out.println("K"+length);
		
	}

}
