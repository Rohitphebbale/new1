package JAVA;

public class Findspecialcharacter {

	public static void main(String[] args) {
		
		String s = "Rohithebbale@#&!";
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
		}
			
			if(count==0){
				System.out.println("there is no special character");
			}
			else
			{
				System.out.println("The total special characters are : " +count);
			}
		}
	}


