import java.util.Scanner; 
public class ExamMark {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int sub[] = new int[6];
		float total=0,avg;
		int check=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.print("Enter Mark of Subject "+(i+1));
			
			sub[i]=scan.nextInt();
			total= total+sub[i];
		
		}
		scan.close();
		
		avg=total/6;
		for(int j=0;j<6;j++) {
		if(sub[j]>=80 && sub[j]<=100)
		{
			System.out.println("Subject "+ (j+1)+" = Credit");
		}
		else if(sub[j]<80 && sub[j]>=40)
		{
			System.out.println("Subject "+ (j+1)+" = Pass");
		}
		else if(sub[j]<40)
		{
			System.out.println("Subject "+ (j+1)+" = fail");
			
		}
		else
		{
			System.out.println("Subject "+ (j+1)+" = invalid");
			check=1;
			
		}
		}
		if(check!=1)
		{
		
      System.out.print("Average"+avg);
		}
	}

}
