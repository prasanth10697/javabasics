import java.util.*;
public class Powers
{
 public static void main(String args[]){
	 int sum=1;
	 Scanner scnr=new Scanner(System.in);
	 int num1=scnr.nextInt();
	 int num2=scnr.nextInt();
	 while(num2!=0){
		 sum=sum*num1;
		 --num2;
	 }
	 System.out.println(sum);
	 
	 
 }
}