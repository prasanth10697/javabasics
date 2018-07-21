import java.util.*;
public class Long
{
 public static void main(String args[]){
	 Scanner scnr=new Scanner(System.in);
	 int num=scnr.nextInt();
	 int i=0;
	 while(num !=0){
		 num=num/10;
		 i++;
	 }
	 System.out.println(i);
	 
	 
 }
}