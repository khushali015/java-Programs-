class DivisibleNo
{
	public static void main(String[] args)
	{
		int number1 = Integer.parseInt(args[0]),number2 = Integer.parseInt(args[1]);
		int noDivisibleBy = Integer.parseInt(args[2]);
		int count = 0;
		for(int i = number1 ; i <= number2 ; i++)
		{
			if(i % noDivisibleBy == 0)
				System.out.print(" " + i);
				//count++;
		}
		
	}
}
		