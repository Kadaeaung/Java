import java.util.Scanner; 
import java.util.*;
import java.lang.*;
public class ExamMark_Cmd {
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Exam Mark Program Command Line");
		System.out.println("Program Start");
		
		Scanner scan = new Scanner(System.in);
		String subs[] = {"Myanmar","English","Maths","Physic","Che","Eco"};
		 //String subs[] = new String[6];
		 
		 
		 int marks[]= new int[6];
		 int subcheck=0;
		 String subject;
		 int mark;
		 //int invalid =0;
		 boolean invalid=true;
		 //int overlap=0;
		 boolean overlap=true;
		 //System.out.println("mark"+marks[1]);
	 int subjectIndex,markindex;
		
		boolean check=true;
		
		while( check==true)
		{
			String cmd= scan.nextLine();

		if(cmd.equals("Start")|| cmd.equals("start"))
		{
			System.out.println(" Your Sujects ");
			System.out.println("Myanamr "+" English "+" Maths "+" Physic "+" Che "+"Eco");
			
			while(subcheck<6)
			{
				
				
				//System.out.println("Subcheck = "+subcheck);
				
				invalid=true;
				while(invalid==true)
				{
					
					System.out.println("Please Enter your Subject");
					 subject=scan.nextLine();

			 
			   if(subject.equals("Exit"))
			{
				System.exit(0);
			}
			//System.out.println(subject);
			
				for(int m:marks)
				{
					if(m==0)
					{
						overlap=false;
					}
				}
			
        
			 if(overlap==true)
			{
				
			 invalid=true;
			 
			}
			 
			 else
				 
			 {
				 
			 
			
		   for(int i=0 ;i<6 ;i++)
		   {
		    if(subs[i].equals(subject))
		    {
		    	
		    	
		    	
		    	System.out.println("Your Subject is correct");
		    	
		    	subjectIndex=i;
		    	
		    	System.out.println("Subject Index "+subjectIndex);
		        invalid=false;
		    	System.out.println("Enter your Subject Marks");
		    	 mark=scan.nextInt();
				   marks[subjectIndex]=mark;
				 System.out.println(subs[i]+" = "+marks[i]);
				 System.out.println("Mark Index "+subjectIndex);
				 subcheck=subcheck+1;
		           System.out.println("Subcheck"+subcheck);


		    		    	
		    }
		    
		    
		    
		    	
		    
		    
		   
		    
		   		   
			   }
		  		   
		   
		  		   
		   
			 }
			
		  
			
			
			 

		   
		   
			}
				
				 

				
		  		   
		   		   		   
			   
		   
	    	
	    			   		   
		  
						
		    
				
				
			
				
			}
			 System.out.println("sucess");
			
			
			
		}
		else if(cmd.equals("Exit")|| cmd.equals("exit"))
		
		{
			check=false;
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
}
