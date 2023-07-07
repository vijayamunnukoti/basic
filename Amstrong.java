import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
	int n ,a=0,rem,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	n=sc.nextInt();
	c=n;
	while(n>0)
	{
		rem=n%10;//153%10=3,15%10=5;
		a=(rem*rem*rem)+a;//(3*3*3)+0=27,125+27=152;
		n=n/10;//153/10=15,15/10=1
		
		
	}
if(c==a)
	System.out.println("the given number is  amstrong");
else
	System.out.println("the given num is not amstrong");

}}

