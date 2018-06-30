import java.util.*;

 public class Odd
 {
   public static void main(String args[])
   {
       Scanner scnr = new Scanner(System.in);
       int n=scnr.nextInt();
       if(n%2==0)
       {
	      System.out.println("Even");
	   }else if(n%2==1)
        {
		  System.out.println("Odd");
		}else
        {
          System.out.println("Invalid");   
        }		
   }   
 }
