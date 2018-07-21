import java.util.*;
import java.util.Collections;

public class Natural{
   public static void main(String[] args) {
     int sum=0;
      Scanner scnr=new Scanner(System.in);
	  int n=scnr.nextInt();
	  for(int i=1;i<=n;i++)
	  { 
	    sum=sum+i;
         		
	  }
	  System.out.println(sum);
	}
}