import java.util.Scanner;
public class reverseNO{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int n=sc.nextInt();
		int ans=0;int counter=0;
		while(n!=0){
			int rem=n%10;
			counter++;
			n=n/10;
			ans=ans*10+rem;
		}
		System.out.println(ans);
		System.out.println("no.of digits entered="+counter);
}
	
}
