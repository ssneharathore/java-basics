public class test{
	static void Armstrongcheck(int num){
		int temp=num;int sum=0;
		while(num!=0){
		int digit=num%10;
	    sum=sum+(digit*digit*digit);
		num=num/10;
	}
		if(temp==sum){
			System.out.println("It is an Armstrong Number");
		}
		else{
			System.out.println("Not an Armstrong Number");
		}
	}
		public static void main(String args[]){
			Armstrongcheck(153);
	}
}