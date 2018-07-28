import java.util.*;
public class Mei{
	public static void main(String args[]){
		Scanner scnr=new Scanner(System.in);
		  String  primeNumbers = "";
		int num=scnr.nextInt();
		int num2=scnr.nextInt();
		for (int i = num; i <= num2; i++)         
       { 		  	  
          int counter=0; 	  
          for(int j =i; j>=1; j--)
	  {
             if(i%j==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	    primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println(primeNumbers);
   }
}