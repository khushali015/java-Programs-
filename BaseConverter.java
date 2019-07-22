//import java.math;
class BaseConverter
{
	public static void main(String args[])
	{
		if(args.length != 2)
		{
			System.out.println("Error ::: Too few parameters");
			System.out.println("You need to enter : Either Binary number or Decimal number");
			System.exit(0);
		}
		int baseType = Integer.parseInt(args[0]);
		int number = Integer.parseInt(args[1]);
		//int len = number.length;
		int num,temp=0,sum=0;
		if(baseType == 1)
		{
			while(number > 0)
			{
				num = number % 10;
				if(num != 1 && num != 0)
				{
					System.out.println("enter valid binary number");
					System.exit(0);
				}
				number /= 10;
				sum += Math.pow(2,temp++)*num;
			}
			System.out.println("Decimal value = " + sum);
		}
		else
		{
			int i = 0;
			String binary = "";
			while(number > 0)
			{
				num = number % 2;
				number /= 2;
				binary += num;
				i++;
			}
			System.out.print("Binary Value = ");
			for(int j = binary.length()-1;j >= 0;j--)
				System.out.print( binary.charAt(j));
		}
		
	}
}

