package Twist;

public class SpyNumForloop {

	public static void main(String[] args) {
		for(int i=1;i<=500;i++)
		{
			int num=i;
			int temp=num;
			int sum=0;
			int prod=1;
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				prod=prod*rem;
				num=num/10;
			}
			if(prod==sum)
			{
				System.out.println(temp+ "it is a spy number");
			}
			else
			{
				System.out.println(temp+ "it is not a spy number");
			}
		}
	}

}
