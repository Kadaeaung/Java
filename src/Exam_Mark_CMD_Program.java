import java.util.Scanner;
public class Exam_Mark_CMD_Program 
{
	public static void main(String[] args) 
	{
	
		String [] subject= {"myanmar","english","maths","chemistry","physics","biology"};
		int mark[]=new int[6];
		int check=0,total=0;
		float average;
		
		boolean PCheck=true;
		while(PCheck)
		{
			Scanner startinput = new Scanner(System.in);
			System.out.println("Enter The Command for the program");
			String s= startinput.nextLine().toLowerCase();
		  
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
						 System.out.println("Enter The Subject");
						 String sub= subinput.nextLine().toLowerCase();
						 boolean isContain=false;
						 if(sub.equals("exit"))
						 {
							 System.exit(0);
						 }
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
								  System.out.println("Enter The Mark:");
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
											  else if(mark[i]>=40 && mark[i]<80)
											  {
												  System.out.println("Subject : "+(sub)+" Pass:\t"+(marks));
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
			else if(s.equals("exit"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid");
			}
		} //

		}
		
	}
	

