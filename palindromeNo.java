import java.util.Scanner;
public class test{
	public static void main(String args[]){
		test ts=new test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		ts.show(num);

	}
	void show(int num){
		int temp=num;int rev=0;
		while(num>0){
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(rev==temp){
		System.out.println("Yes,It's a Palindrome Number");
	}
	else{
		System.out.println("No,It's not a Palindrome");
	}
	}
}