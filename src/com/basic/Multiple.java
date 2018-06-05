package com.basic;

public class Multiple {
	int n1;
	int n2;
public void  isMultiple(int n1,int n2)
{
	if(n1%n2 == 0)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("flase");
	}
}
	public static void main(String args[])
	{
		Multiple n1=new Multiple();
		n1.isMultiple(12,5);
	}

}
