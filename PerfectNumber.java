package Twist;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int i=1;
		int num=6;
		int sum=0;
		while(i<num)
		{
			if(num%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==sum)
		{
			System.out.println(num+ "is a Perfect number");
		}
		else
			System.out.println(num+ "is not a Perfect number");
	}

}
