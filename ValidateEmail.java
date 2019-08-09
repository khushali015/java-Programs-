class ValidateEmail
{
	public static void main(String[] args)
	{
		String email = args[0];
		char ch = email.charAt(0);
		int c = (int)ch;
		
		int firstCharUnicode = email.codePointAt(0);
        if(firstCharUnicode < 97 || firstCharUnicode > 122)
        {
			System.out.println("Invalid : First letter should be small alphabet or digit");
			System.exit(0);
        }
		
		String emailParts1[] = email.split("@");
		int emailNameLength = emailParts1[0].length();
		if(emailParts1.length != 2)
		{
			System.out.println("Invalid : There must be 1 @ ");
			System.exit(0);
		}
		if(emailNameLength < 8 || emailNameLength > 20)
		{
			System.out.println("Invalid : Length of email name must be between 8 to 20 characters");
			System.exit(0);
		}
		for(int i=0 ; i < emailNameLength ; i++)
		{
			int charUnicode = emailParts1[0].codePointAt(i);
			if((charUnicode > 58 && charUnicode < 64) || (charUnicode >= 91 && charUnicode<=96 && charUnicode!=95) ||(charUnicode < 47 && charUnicode != 46))
			{
				System.out.println("Invalid : Special symbols are not allowed : " + (char)charUnicode);
				System.exit(0);
			}
		}
		
		String emailParts2[] = email.split("\\.");
		if(emailParts2.length < 2)
		{
			System.out.println("Invalid : There must be atleast one '.'");
			System.exit(0);
		}
		
		int dotPosition = emailParts1[1].indexOf('.');
		if(dotPosition < 2)
		{
			System.out.println("Invalid : There must be domain name");
			System.exit(0);
		}
		System.out.println("Valid");
	}
}