import java.util.*;
public class Java_testing1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a=1000;
		int b=2;
		double dob;
		int d,m;
		
		if(b==1000 || b>999)
		{
			a=1000;
			System.out.println("A");
		}
		else if(b==100  || b>99)
		
		{
			a=100;
			System.out.println("B");
		}
		else if(b==10 || b>9)
		{
			a=10;
			System.out.println("C");
		}
		
		
		
	while( b>10)
	{
	
		d=b/a;
		m=b%a;
	
		//System.out.println(dob);
		System.out.println("D "+(d*a));
		b=m;
		a=a/10;
		if(m<10)
		{
			System.out.println("M "+m);
		}
		
	}
	System.out.println("D "+b);

	}

}
