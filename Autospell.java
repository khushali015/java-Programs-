import java.util.Scanner;
class Autospell
{
	static boolean anagram(String s1,String s2)
	{
		int arr[] = new int [26];
		int len = arr.length;
		System.out.println(len);
		s1.toLowerCase();
		s2.toLowerCase();

		if(s1.length() == s2.length())
		{
			for(int i=0;i<s1.length();i++)
				arr[s1.charAt(i)-'a']++;
			
			for(int i=0;i<s2.length();i++)
			{
				if((arr[s2.charAt(i)-'a'])==0)
				{
					return false;
					//System.exit(0);
				}				
				else
					arr[s2.charAt(i)-'a']--;
			}
			
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args)
	{
		String dictionary[] = {"hello","print","return","scan","good","bad","khushali","laptop"};
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i < dictionary.length;i++)
		{
			if(anagram(str,dictionary[i]))
			{
				System.out.println("Did you mean " + dictionary[i] + "?");
				System.exit(0);
			}
		}		
	}
}