class ReverseString
{
	public static void main(String[] args)
	{
		//int len = args.length;
		String name = args[0];
		String stringParts[] = name.split(" ");
		StringBuffer words[] = new StringBuffer[stringParts.length];
		StringBuffer reversedString = new StringBuffer();
		for(int i=0;i < words.length;i++)
		{
			words[i] = new StringBuffer(stringParts[i]);
			words[i].reverse();
			reversedString.append(" " +words[i]);
			
		}
			System.out.print(reversedString);
	}
}