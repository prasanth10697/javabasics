	import java.util.Arrays;
		import java.util.Collections;
		import java.util.Scanner;
		public class Maximum
		{
		 public static void main(String[] args)
		{
		  Scanner scnr=new Scanner(System.in);
		  String[] num=scnr.nextLine().split(" ");
		   String num2= Collections.max(Arrays.asList(num));
		   System.out.println(num2);
		}
		

	}
