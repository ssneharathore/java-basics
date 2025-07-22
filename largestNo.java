import java.util.Scanner;
public class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		System.out.println("enter the third number");
		int n3=sc.nextInt();
		int max=n1;
		if(n2>n1){
			max=n2;
		}
		if(n3>n2){
			max=n3;
		}
		System.out.println(max+"is the largest number");
	}
}