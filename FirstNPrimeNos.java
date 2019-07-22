class FirstNPrimeNos
{
	public static void main(String[] args)
	{
		int numberOfPrimes = Integer.parseInt(args[0]);
		int count = 0;
		int num = 2;
		while(count < numberOfPrimes)
		{
			boolean flag = true;
			for(int j = 2 ; j <= Math.sqrt(num) ; j++)
			{
				if(num % j == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				count++;
				System.out.println(num);
			}
			num++;
			//System.out.println("hii");
		}
	}
}			