class Calculator
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int operation = Integer.parseInt(args[2]);
		if(operation == 1)
		{
			int sum = num1 + num2;
			System.out.println("Sum = " + sum);
		}
		else if(operation == 2)
		{
			int difference = num1 - num2;
			System.out.println("Difference = " + difference);
		}
		else if(operation == 3)
		{
			int product = num1 * num2;
			System.out.println("Product = " + product);
		}
		else if(operation == 4)
		{
			int divide = num1 / num2;
			System.out.println("Division = " + divide);
		}
		else
		{
			System.out.println("enter valid number");
		}
	}
}
		
			