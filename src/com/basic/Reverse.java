package com.basic;



public class Reverse {
	  public void Rev(int[] number)
	   {
		   int number1 = 3456;
		   for(int i=0;i<number.length;i++)
		   {
			   int b=number1%10;
			   System.out.println("reverse="+b);
			   number1=number1/10;
		   }
		   
		   
	   }
	   public static void main(String args[])
	   {
		   int[] number=new int[7];
		   Reverse obj=new Reverse();
		   obj.Rev(number);
	   }
}
