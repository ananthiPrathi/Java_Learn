
import java.util.Scanner;
public class ConditionalStatement
{
public static void main(String[] args)
{
   //if  else
   /*int a =100;
   int b= 50;
   if(a==b)
   {
      System.out.println("It is correct");
   }
   else 
   {
   System.out.println("It is wrong");
   }*/
   
   // Nested -If
   /*Scanner sc = new Scanner (System.in);
   System.out.println("Enter your age");
   int input = sc.nextInt();
   if(input < 35)
   {
	   System.out.println("Sorry, Not Qualified");
	   return;	   
   }
   
   if(input < 80)
	{
		System.out.println("congrats! you are passed but not Qualified  Leader position");  
		return;
	}
		
	System.out.println("congrats! you are Qualified  Leader position");*/
	
   
   //Else if
      /*int a=50;
	  int b=100;
	  
	  if(a>b)
	  {
		  System.out.println("A is greater than b");
	  }
	  else if(b>a)
	  {
		  System.out.println("b is greater than a");
	  }
	  else{
		   System.out.println("a equals to b");
	  }*/
	  Scanner sc = new Scanner (System.in);
      System.out.println("Enter your age");
	  int input = sc.nextInt();
	  
	  switch(input)
	  {
	  case 1:
	     System.out.println("Monday");
		 break;
	  case 2:
	     System.out.println("Tuesday");
		 break;
      case 3:
	     System.out.println("Wednesday");	
		 break;
      case 4:
	     System.out.println("Thursday"); 
         break;		 
	  default:
	     System.out.println("sorry!error input");
	  }
		 
		 
   
   
   
}
}