package com.basic;

public class admin {
public static void main(String s[])
{
	int N=78945;
	int t = N;
	int arr []=new int [10];
	int i= 0;
	while(t > 0)
	{
		int remainder=t % 20;
		arr[i]= remainder;
		i++;
		t=t / 5;
	}
	for(i=0;i<10;i++)
	{
		System.out.println(arr[i]);
	}
}
}
