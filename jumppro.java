package JAVA;

import org.omg.CosNaming.IstringHelper;

public class jumppro {

	public static void main(String[] args) {
		
		// intput = ABCD ABCD
		// OUTPUT = CDAB
		
		String s1 = "ABCD";
		String s2 = "CDAB";
		if(isRotation(s1, s2))
		{
			System.out.println("rotation of string is present");
		}
		else
		{
			System.out.println("rotion of string is not fount");
		}
		
		
	}
	public static boolean isRotation(String s1, String s2)
	{
		return(s1.length()==s2.length()) && ((s1+s2).indexOf(s2)!=-1);
	}

}
