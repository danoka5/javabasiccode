package com.syntax.class2;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name="Dana";
  String lastName="Zhussupova";
  char grade='A';
  
  String city="New York";
  city="Almaty";
  String state="New York";
  long phoneNumber=9174990417l;
  phoneNumber=123456789019l;
  
  System.out.println("My name is "+name+" and my lastname is "+lastName+".");
  System.out.println("I am an "+grade+ " student"+".");
  System.out.println("I live in "+city+" "+"city "+"state"+" "+state+".");
  System.out.println("and my phone number is"+" "+phoneNumber+".");
	System.out.println("My name is still the same and it is "+name+".");
	System.out.println("I am from"+" "+city+" "+"city "+"and my new phone number is "+phoneNumber+".");

	grade='B';
	System.out.println("I am a "+grade+" student"+" now "+".");
	}

}
