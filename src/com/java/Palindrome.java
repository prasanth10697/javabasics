import java.util.*;
public class Palindrome
{
 public static void main(String args[]){
	 int r,temp,sum=0;
	 Scanner scnr=new Scanner(System.in);
	 int num=scnr.nextInt();
	 temp=num;    
  while(num>0){    
   r=num%10;  
    sum=(sum*10)+r;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("Yes");    
  else    
   System.out.println("No");
 }
}