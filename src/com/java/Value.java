import java.util.*;
public class Value
{
 public static void main(String args[])
 {
	 Scanner scnr=new Scanner(System.in);
	 int sum=0;
	 int N=scnr.nextInt();
	 int K=scnr.nextInt();
	 int[] num =new int[N];
	 for(int i=0;i<num.length;i++)
	 {
		 num[i]=scnr.nextInt();
	 }
	 for(int i=0;i<K;i++)
	 {
	  sum=sum+num[i];
	  }
	  System.out.println(sum);
 }
}