class CurrencyConvertor
{
	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Error ::: Too few parameters");
			System.out.println("You need to enter:\n currencyType \n currencyValue \n");
			System.exit(0);
		}
		int currencyType = Integer.parseInt(args[0]);
		double currencyValue = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		if(currencyType == 1)
		{
			System.out.println("$" + currencyValue + " = " + (currencyValue * rate) + "INR");
		}
		else
		{
			System.out.println(currencyValue + "INR = $ " + (currencyValue / rate) );
		}
	}
}
		