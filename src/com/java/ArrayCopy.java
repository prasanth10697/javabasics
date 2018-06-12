package com.java;

public class ArrayCopy {
	public static void main(String args[])
	{
		int i;
		int one[]= {12,23,21,2,3};
		int two[]=new int [one.length];
		for(i=0;i<one.length;i++)
		{
			two[i]=one[i];
		}
		
		System.out.println(two[i]);
		//em.arrayarray(one,0, two, 0, one.length);
	}

}
