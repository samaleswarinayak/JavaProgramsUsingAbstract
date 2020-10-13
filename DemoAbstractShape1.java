/*Use of Polymorphism and Abstract keyword in java */

import java.util.*;
abstract class ShapeAbstract1
{
	int side1,side2;
	abstract void input();
	abstract void area();
	abstract void printarea();
}
class Rectangle11 extends ShapeAbstract1
{
	int res;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two sides of rectangle");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
	}
	void area()
	{
		res = side1 * side2;
	}
	void printarea()
	{
		System.out.println("Area of rectangle is "+res);
	}

}
class Triangle11 extends ShapeAbstract1
{
	double res;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height of triangle");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
	}
	void area()
	{
		res = 0.5 * side1 * side2;
	}
	void printarea()
	{
		System.out.println("Area of triangle is "+res);
	}

}
class Square11 extends ShapeAbstract1
{
	int res;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square");
		side1 = sc.nextInt();
	}
	void area()
	{
		res = side1 * side1;
	}
	void printarea()
	{
		System.out.println("Area of square is "+res);
	}
}
class DemoAbstractShape1
{
	public static void main(String args[])
	{
		Rectangle1 ob1 = new Rectangle1();
		ob1.input();
		ob1.area();
		ob1.printarea();
		
		Triangle1 ob2 = new Triangle1();
		ob2.input();
		ob2.area();
		ob2.printarea();
		
		Square1 ob3 = new Square1();
		ob3.input();
		ob3.area();
		ob3.printarea();
	}
}