package Pattern;

public class H {
	public static void main(String[] args) {
		
	
	 int n=5;
	 
	 for(int i=0; i<n; i++)
	 {
		 for(int j=0; j<n; j++)
		 {
			 if(j==0 || i==2 || j==4)
			 {
				 System.out.print("*");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
}

}

