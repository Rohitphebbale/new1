package Pattern;

public class O{
	public static void main(String[] args) {
		
	

	int n=4;
	
	 for(int i=0; i<n; i++)
	 {
		 for(int j=0; j<n; j++)
		 {
			 if(j==0 || i==0 && j<=2 || j==2 && i==1 ||j==2 && i==2 || j<3 && i==3)
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
