// 9^2 = 81   and 8+1 = 9


package Twist;

public class NeonNumber {

	public static void main(String[] args) {
		
		
		int num = 9 ;
		int a = num * num;
		int sum = 0;
		
		while (a>0)
			{
				int rem = a%10;
				sum = sum + rem;
				a = a/10;
			}
			if(sum==num)
			{
				System.out.println("it is a neon number");
			}
			else
				System.out.println("it is not a neon number");
	}

}
