class PrintCapitalWord
{
	public static void main(String args[])
	{
		String str = args[0];
		String string[] = str.split(" ");
		boolean flag = false;
		for(int i=0;i < string.length;i++)
		{
			for(int j=0;j < string[i].length();j++)
			{
				if(string[i].charAt(j) >= 'A' && string[i].charAt(j) <= 'Z')
					flag = true;
				else
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(string[i] + " ");
		}
	}
}