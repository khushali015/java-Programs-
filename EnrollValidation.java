class EnrollValidation
{
	public static boolean enrollCheck(String enroll)
	{
		String year = enroll.substring(0,2);
		//System.out.println(year);
		if(!( year.equals("18") ||  year.equals("17") || year.equals("16") ))
			return false	;
		
		String collegeCode = enroll.substring(2,5);
		//System.out.println(collegeCode.equals("047"));	
		
		if( !collegeCode.equals("047"))
			return false;
		
		String student = enroll.substring(5,7);
		//System.out.println(student);
			
		if(!(student.equals("01")  || student.equals("31")  ))
			return false;
		
		String branchCode = enroll.substring(7,9);
		//System.out.println(branchCode);
		if(!branchCode.equals("07"))
			return false;
		
		int number = Integer.parseInt(enroll.substring(9,12));
		//System.out.println(number);
		if(number == 0 || number > 79)
			return false;
		//else
		return true;
	}
	public static void main(String[] args)
	{
		String enrollNo = args[0];
		boolean check;
		check =  enrollCheck(enrollNo);
		if(check)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}