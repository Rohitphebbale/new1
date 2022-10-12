package Twist;

public class SpyNumber {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		int temp1=num;
		int prod=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if(sum==prod)
		{
			System.out.println(temp1+ "it is a spy Number");
		}
		else
			System.out.println(temp1+ "it is not a spy Number");
	}

}
