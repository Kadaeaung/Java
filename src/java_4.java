import java.util.*;
public class java_4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int I=1,
			V=5,
			X=10,
			L=50,
			C=100,
			D=500,
			M=1000,
		    IV=4,
		    IX=9,
		    XL=40,
		    XC=100,
		    CD=500,
		    CM=900;
		
		int value[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		int value1[]= {4,9,40,90,400,900};
		int num;
		String s,s1;
		String vd="invalid";
		int check=0;
		String G[]= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		
		Scanner input =new Scanner(System.in);
		  String data=input.nextLine();
		  String arr[];
		  int total=0;
		  int num1[];

		  try 
			{ 
				Integer.parseInt(data); 
				System.out.println(data + " is a valid integer"); 
				
				num=Integer.parseInt(data);
				
				if(num>0)
				{
					System.out.println("Valid Data");
					
				  
					
					int a=1000;
					int b=num;
					double dob;
					int d,m;
					int r=0;
					int[] room=new int[4];
					
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
					else if(b<=9)
					{
					System.out.println("D "+b);
					}
					
					
				while( b>10)
				{
				
					d=b/a;
					m=b%a;
				
					//System.out.println(dob);
					System.out.println("D "+(d*a));
					room[r]=(d*a);
					b=m;
					a=a/10;
					if(m<10)
					{ 
						d=m;
						System.out.println("M "+d);
						room[r+1]=(d);
						r=r+1;
						System.out.println("R"+r);
					}
					r=r+1;
					
					
				}
		
				if(b>=10)
				{
					r=r+1;
				   // System.out.println("OK");
					room[r-1]=b;
					System.out.println("R"+room[1]);
				}
				
				int tt;
				String[] ss=new String[r];
				for(int i=0; i<r;i++)
				{
				 System.out.println("OK");
					System.out.println(room[i]);
					tt=room[i];
					if(tt==1000)
					{
						if(tt==1000)
						{
							ss[i]="M";
							
						}
						
						System.out.println("A");

					}
					else if(tt<1000 && tt>100)
					{
						System.out.println("B");
						if(tt==1000)
						{
							ss[i]="M";
						}
						else if(tt==900)
						{
							ss[i]="CM";
						}
						else if(tt==500)
						{
							ss[i]="D";
						}
						else if(tt==400)
						{
							ss[i]="CD";
						}
						
						else if(tt==100)
						{
							ss[i]="C";
						}
						else if(tt==200)
						{
							ss[i]="CC";
						}
						else if(tt==300)
						{
							ss[i]="CCC";
						}
						else if(tt==600)
						{
							ss[i]="DC";
						}
						else if(tt==700)
						{
							ss[i]="DCC";
						}
						else if(tt==800)
						{
							ss[i]="DCCC";
						}



				
					}
					else if(tt>=90 )
					{
					
						System.out.println("C");
						if(tt==100)
						{
							ss[i]="C";
						}
						else if(tt==90)
						{
							ss[i]="XC";
						}
						else if(tt==50)
						{
							ss[i]="L";
						}
						else if(tt==40)
						{
							ss[i]="XL";
						}
						
						else if(tt==10)
						{
							ss[i]="X";
						}
						else if(tt==20)
						{
							ss[i]="XX";
						}
						else if(tt==30)
						{
							ss[i]="XXX";
						}
						else if(tt==60)
						{
							ss[i]="LX";
						}
						else if(tt==70)
						{
							ss[i]="LXX";
						}
						else if(tt==80)
						{
							ss[i]="LXXX";
						}

						
					}
					else if(tt<=10 )
					{
						
						System.out.println("D");
						if(tt==10)
						{
							ss[i]="X";
						}
						else if(tt==9)
						{
							ss[i]="IX";
						}
						else if(tt==5)
						{
							ss[i]="V";
						}
						else if(tt==4)
						{
							ss[i]="IV";
						}
						
						else if(tt==1)
						{
							ss[i]="I";
						}
						else if(tt==2)
						{
							ss[i]="II";
						}
						else if(tt==3)
						{
							ss[i]="III";
						}
						else if(tt==6)
						{
							ss[i]="VI";
						}
						else if(tt==7)
						{
							ss[i]="VII";
						}
						else if(tt==8)
						{
							ss[i]="VIII";
						}

					}
					}
				
				for(int i=0;i<r;i++)
				{
					System.out.print(ss[i]);
				}
				
				
				

					
					
					
				}
				else 
				{
					System.out.println("Invalid Data");
					
				}
				
				
			}  
			catch (NumberFormatException e)  
			{ 
				System.out.println(data + " is not a valid integer"); 
				arr=data.split("");
				
				
				for(int i=0;i<arr.length;i++)
				{
					
					for(int j=0;j<G.length;j++)
					{
						System.out.println(arr[i]+"|"+G[j]);
						s=arr[i];
						s1=G[j];
						
						if(s1.equals(s))
						{
							//System.out.print("VD valid");
							check=check+1;
						}
											

					}
											
				}
			/*	System.out.println("Arr length"+arr.length);
				System.out.println("Check "+check);
				String a[]={"aa"},b[]={"aa"};
				if(a==b)
				{
					System.out.println("Hello");
				}
				*/
				
				
				if(check==arr.length)
				{
					System.out.println("Data valid");
					
					String [] word= new String[arr.length];
					String w,w1;
					int c1=0;
					
					for(int i=0;i<arr.length;i++)
					{
						w=arr[i];
						
						
						if(w.equals("I") && i<arr.length-1)
						{
							w1=arr[i+1];
							if(w1.equals("V") || w1.equals("X") )
							{
								w1=arr[i]+arr[i+1];
								word[i]=w1;
								i++;
								if(arr.length-2==i)
								{
									c1=1;
								}
						    }
							else 
							{
							     word[i]=arr[i];
							}
						
						
					}
						
						else if(w.equals("X") && i<arr.length-1)
						{
							w1=arr[i+1];
							if(w1.equals("L") || w1.equals("C"))
							{
								w1=arr[i]+arr[i+1];
								word[i]=w1;
								i++;
								if(arr.length-2==i)
								{
									c1=1;
								}


							}
							else 
							{
							     word[i]=arr[i];
							}

							
							
							
						}
						
						else if(w.equals("C") && i<arr.length-1)
						{
							w1=arr[i+1];
							if(w1.equals("D") || w1.equals("M"))
							{
								w1=arr[i]+arr[i+1];
								word[i]=w1;
								i++;
								if(arr.length-2==i)
								{
									c1=1;
								}


							}
							else 
							{
							     word[i]=arr[i];
							}

							
							
							
						}
						else
						{
							if(c1!=1)
							{
							
							word[i]=arr[i];
						
							}
					    }
					
						
					
					}
					
					
					
			 for(int i=0;i<word.length;i++)
			 {
				 System.out.println(word[i]);
			 }
			 System.out.println("C1"+c1);
			 
			 
			 
					
					
				
					for(int i=0;i<word.length;i++)
					{
						for(int j=0;j<G.length;j++)
						{
							s=word[i];
							s1=G[j];

							if(s1.equals(s))
							{
								total=total+value[j];
								System.out.println(total);
							}
							
						}
						
						
					}
					
					System.out.println("Total = "+total);
					
				}
				else 
				{
					System.out.println("Data invalid");
					
					
				}
				
			} 

	}

}
