abstract class Shape
{
	abstract void area(float a,float b);
}
class Rectangle extends Shape
{
	void area(float l ,float b)
	{
		System.out.println("Area of rectangle is " + l*b);
	}
}
class Circle extends Shape
{
	void area(float r,float pi)
	{
		System.out.println("Area of circle is " + pi*r*r);
	}
}
class Triangle extends Shape
{
	void area(float base ,float alt)
	{
		System.out.println("Area of triangle is " + 0.5*base*alt);
	}
}
class CalculateArea
{
	public static void main(String[] args)
	{
		Shape s;
		s = new Rectangle();
		s.area(5f,10f);
		s = new Circle();
		s.area(10f,3.14f);
		s = new Triangle();
		s.area(5f,10f);
	}
}