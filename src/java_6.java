import java.util.*;
public class java_6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String B1[]= {"{","}"},B2[] = {"[","]"},B3[] = {"(",")"};
		String input;
		String data[];
		String d,b1,b2,b3;
		String testO,testC,tO,tC;
		
		boolean con=true;
		
		int check=0;
		int sub=1;
		
		Scanner scan = new Scanner(System.in);
		
		input=scan.nextLine();
		System.out.println(input);
		
           data=input.split("");
           
           String[] G = new String[data.length];
           
           for(int i=0;i<data.length;i++)
           {
        	   testO=data[i];
        	   for(int d1=0;d1<B1.length;d1++)
        	   {
        		   tO=B1[d1];
        		   
        		   if(tO.equals(testO))
        		   {
        			   G[i]="A";
        		   }
        		   
        	   }
        	   for(int d2=0;d2<B2.length;d2++)
        	   {
        		   tO=B2[d2];
        		   if(tO.equals(testO))
        		   {
        			   G[i]="B";
        		   }
        		   
        	   }
        	   for(int d3=0;d3<B3.length;d3++)
        	   {
        		   tO=B3[d3];
        		   if(tO.equals(testO))
        		   {
        			   G[i]="C";
        		   }
        		   
        	   }

        	   
           }
           
           for(int i=0;i<data.length;i++)
           {
        	   System.out.println("G "+G[i]);
           }
      
           for(int i=0;i<data.length;i++)
           {
        	   testO=data[i];
        	   testC=data[i];
        	   
        	 
        	   System.out.println(testO);
        	
//        	   if(data[i].equals("("))
//        	   {
//        		   System.out.println("True");
//        		   if(testC.equals(")"))
//        		   {
//        			   System.out.println("true");
//        		   }
//        	   }
        	   
        	        	   
        		   
        	   		tO=G[i];
        	   
        	   if(testO.equals("{") ||testO.equals("[") || testO.equals("(") || check>0  )
        	   {
        		   System.out.println("OK");
        		   check=check+1;
        		   System.out.println(testO);
        		   if(testO.equals("}") ||testO.equals("]") || testO.equals(")") )
        		   {
        			   System.out.println("KO");
        			   testC=data[(check-1)-sub];
        			   tC=G[(check-1)-sub];
        			   sub=sub+2;
        			   System.out.println("O"+i+tO);
    				   System.out.println("C"+((check-1)-sub)+tC);

        			   if(tC==tO)
        			   {
        				   System.out.println(testO);
        				   System.out.println(testC);
        				  
        				   
        			   }
        			   else
        			   {
        				   System.out.println("Invalid");
        				   con=false;
        			   }
        			   
        				   
        			   
        		   }
        		   
        	   }
        	   else 
        	   {
        		   System.out.println("Invalid Data");
        	   }
        	   
        	 
        	   
           }
           if(con==true)
    	   {
    		   System.out.println("True");
    	   }
    	   else if(con==false)
    	   {
    		   System.out.println("False");
    	   }
	}

}
