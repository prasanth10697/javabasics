package com.basic;

public class Praveen {
	int month;
	int day;
	int year;
	
	public Praveen(int month,int day,int year)
	{
	this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getMonth()
	{
		return month;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getDay() 
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public void DisplayDate() {
		System.out.println("month=" + month + ", day=" + day + ", year=" + year  );
	}
public static void main(String args[])
{
	Praveen pp=new Praveen(06,05,2018);
	pp.DisplayDate();
	}
}

	
	

	
	

	
