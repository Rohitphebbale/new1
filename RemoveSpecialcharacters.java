package JAVA;

public class RemoveSpecialcharacters {


	public static void main(String[] args) {
		
		String s = "Rohithebbale@#&!";
		String s1 = "";
		int count=0;
		
		for(int i=0; i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
			
			if(count==0){
				System.out.println("there is no special character");
			}
			else
			{
				System.out.println("The total special characters are : " +count);
			}
			System.out.println("Special character remove : " +s1);
		}
	}

