import java.util.Scanner;
class evenorodd{
	public void checkEvenOdd(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number%2==0){
		System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
	}
public static void main(String args[]){
	evenorodd eo=new evenorodd();
	eo.checkEvenOdd();
}
}