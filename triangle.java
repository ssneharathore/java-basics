public class test{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<=5;i++){
			for(j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<= (2 * i- 1);j++){
			  System.out.print("*");
			}
			System.out.println();
		}
	}
}
