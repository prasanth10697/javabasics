package com.basic;

public class date {
	  int day;
	  int year;
	  int month;
	  public date(int day,int year,int month) {
		  this.day=day;
		  this.year=year;
		  this.month=month;
		  
	  }
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void displayDate() {
		System.out.println(+day+"/" +year +"/" +month);
	}
		
		public static void main(String args[]) {
		date d1 = new date(31,5,2018);
		d1.setDay(31);
		d1.setMonth(5);
		d1.setYear(2018);
		d1.displayDate();
		date d2 = new date(1,6,2018);
		d2.setDay(1);
		d2.setMonth(6);
		d2.setYear(2018);
		d2.displayDate();
			
		
	}

	}

