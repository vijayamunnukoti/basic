
public class SumOfDigits {

	public static void main(String[] args) {
		int n=4534,max=0;
	
		while(n>0)
		{
			int dig=n%10;
			max = Math.max(max,dig);
			n=n/10;
	}
System.out.println("the largest digits is:"+max);
}
}
