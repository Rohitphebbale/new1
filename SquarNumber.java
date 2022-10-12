package Twist;

public class SquarNumber {

	public static void main(String[] args) {
		
		int count=0;
		int n=9;
		int i=1;
		while(i<=n/2)
		{
			int sqr=i*i;
			if(n==sqr)
			{
				count=1;
				break;
			}
			i++;
		}
		if(count==1)
		{
			System.out.println(n+ "is a squar number");
		}
		else
			System.out.println(n+ "is not a squar number");
	}

}
