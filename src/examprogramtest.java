import java.util.Scanner;
public class examprogramtest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String [] subject= {"Myanmar","English","Maths","Chemistry","Physics","Biology"};
		int mark[]=new int[6];
		int check=0;
		float total=0,average;
		
		boolean isStarting=true;
		while(isStarting)
		{
			Scanner startinput = new Scanner(System.in);
			System.out.println("Enter The Command for the program");
			String s= startinput.nextLine().toLowerCase();
		    System.out.println(s);
			if(s.equals("start"))
			{
				boolean iskeyvalid=true;
				while(iskeyvalid)
				{
					boolean isfull=true;
				 for(int m:mark)
				 {
					 if(m==0)
					 {
						 isfull=false;
					 }
					
				 }
				 if(isfull)
				 {
					 iskeyvalid=false;
				 }
				 else
				 {
					 boolean iskeycorrect=true;
					 while(iskeycorrect)
					 {
						 Scanner subinput= new Scanner(System.in);
						 System.out.print("Enter The Subject");
						 String sub= subinput.nextLine();
						 boolean isContain=false;
						 for(String x:subject)
						 {
							 if(x.equals(sub)) 
							 {
								 isContain=true;
								 
							 }
						 }
						 boolean ismarkexit=false;
						 for(int i=0;i<subject.length;i++)
						 {
							if(sub.equals(subject[i]))
							{
								if(mark[i]!=0)
								{
									ismarkexit=true;
								}
							}
						 }
						 
						 
						if(isContain && !ismarkexit)
						{
							boolean ismarkvalid=true;
							while(ismarkvalid)
								{
								  System.out.print("Enter The Mark:");
								  Scanner markinput = new Scanner(System.in);
								  int marks = markinput.nextInt();
								  if(marks <0 || marks>100)
								  {
									  System.out.println("Invalid!");
								  }
								  else
								  {
									  for(int i=0;i<subject.length;i++)
									  {
										  if(sub.equals(subject[i]))
										  {
											  mark[i]=marks;
											  if(mark[i]>=80 && mark[i]<=100)
											  {
												  System.out.println("Subject : "+(sub)+" Credit:\t"+(marks));
												  
											  }
											  else if(mark[i]<40)
											  {
												  System.out.println("Subject : "+(sub)+" Fail:\t"+(marks));
													  
											  }
											  ismarkvalid=false;
											  iskeycorrect=false;
											  
													  
										  }
									  }
								  }
							    }
						}
					 }
				 }
				}
					
			}
		} //
		
		

	}

}
