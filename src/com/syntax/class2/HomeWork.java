package com.syntax.class2;

public class HomeWork {
	public static void main(String []args) { 
	//HW 1)
		float x=2.99f;
		float y=2.99f;
		float sum, div, mult, sub, square;
		sum =x+y;
		div=x/y;
		mult=x*y;
		sub=x-y;
		square=x*y;
	
		System.out.println("The sum of 2 numbers "+ x + " and " +y+" is equal to "+sum+".");
	System.out.println("The divison of 2 numbers "+x+" and "+y+" equals to "+div+".");
	System.out.println("The multiplcation of 2 numbers "+x+" and "+y+ " equals to "+mult+".");
	System.out.println("The subtraction of 2 numbers "+x+" and " +y+" equals to "+sub+".");
	
	//HW 2)
	System.out.println("The square of the "+x+" and "+y+" equals to "+square);
	
	int width=5;
	int height=8;
	int area, perimeter;
	area=width*height;
	perimeter=2*(width+height);
	
	System.out.print("The perimeter of a rectangle with width " +width+" and height "+height+ " is equal to "+perimeter+" and the area is "+area);
	
System.out.println("---------------");
int a=100;
a+=500;
System.out.println(a);//600
a+=200;
System.out.println(a);//200

int b=10;
b-=60;
System.out.println(b);

int cakePiece=11;
cakePiece/=4;
System.out.println(cakePiece);

int cake=25;
cake/=7;

System.out.println(cake);
cake=25;
cake%=7;
System.out.println(cake);

	
	}
}
