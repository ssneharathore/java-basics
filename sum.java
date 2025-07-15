import java.util.Scanner;
class sum{
public void sum(){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int a=sc.nextInt();
System.out.println("enter second number:");
int b=sc.nextInt();
int Sum=a+b;
System.out.println("sum="+Sum);
}
public static void main(String args[]){
sum Sum=new sum();
Sum.sum();
}
}
 	