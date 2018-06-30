import java.util.*;

 public class Size
 {
   public static void main(String args[])
   {
       Scanner scnr = new Scanner(System.in);
       int n=scnr.nextInt();
       if(n>0)
       {
	      System.out.println("Postivie");
	   }else if(n==0)
        {
		  System.out.println("zero");
		}else
        {
          System.out.println("negative");   
        }		
   }   
 }
