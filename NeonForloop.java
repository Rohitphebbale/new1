// 9^2 = 81   and 8+1 = 9

package Twist;

public class NeonForloop {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++)
		{
			int num=i;
			int a=num*num;
			int sum=0;
			int rem;
			while(a>0)
			{
				rem=a%10;
				sum=sum+rem;
				a=a/10;
			}
			if(sum==num)
			{
				System.out.println(num + "is a neon number");
			}
			else
				System.out.println(num+ "is not a nean number");
		}

	}

}
