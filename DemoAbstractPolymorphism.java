/*Use of Abstract keyword in java */

import java.util.*;
abstract class ShapeAbstract
{
	int side1,side2;
	abstract void input();
	abstract void area();
	abstract void printarea();
}
class Rectangle1 extends ShapeAbstract
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
class Triangle1 extends ShapeAbstract
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
class Square1 extends ShapeAbstract
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
class DemoAbstractPolymorphism
{
	public static void main(String args[])
	{
		ShapeAbstract ob;//Reference of parent class
		ob = new Rectangle1();//Upcasting
		ob.input();
		ob.area();
		ob.printarea();
		
		ob = new Triangle1();//Upcasting
		ob.input();
		ob.area();
		ob.printarea();
		
		ob = new Square1();//Upcasting
		ob.input();
		ob.area();
		ob.printarea();
	}
}