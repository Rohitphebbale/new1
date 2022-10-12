package Twist;

public class factorial {

	public static void main(String[] args) {
		
		int a=5;
		int fact=1;
		while(a>0)
		{
			fact=fact*a;
			a--;
		}
		System.out.println(fact);
	}

}

//1*2*3*4*5 = 120
