/*
 * This program is part of my learning Java series
 * This one looks at getting a returned data type 
 * from a method
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-6-avoiding-tangled-code-with.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

public class ReturnData {
	
	private static int incrementNumber(int num)
	{
		num++;
		
		System.out.println("Inside method - number set to ..." + num);
		
		return num;
	}
	
	private static String addedStrings (String str1, String str2)
	{
		String retString = str1 + " " + str2;
		
		System.out.println("Inside method - new string is ..." + retString);
		
		return retString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		
		System.out.println("Initialised number set to ..." + number);
		
		number = incrementNumber(number);
		
		System.out.println("Outside method - number set to ..." + number);
		
		// I can declare a set of variables using the comma
		String strHi, strWorld, strAnswer;
		strHi = "Hey";
		strWorld = "World";
		
		strAnswer = addedStrings(strHi, strWorld);
		
		System.out.println("Outside method - new string is ..." + strAnswer);
		
	}
	
	
}
