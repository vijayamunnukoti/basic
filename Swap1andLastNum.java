
public class Swap1andLastNum {

	public static void main(String[] args) {
		int n=547;
		System.out.println("the given is"+n);
		String str=""+n;
		String LastDigit=""+str.charAt(str.length()-1);//4-1=3[6];
		String remaining=str.substring(1,str.length()-1);//465
		String FirstDigit=""+str.charAt(0);//5
		String Swapped=LastDigit+remaining+FirstDigit;
		n=Integer.parseInt(Swapped);
		System.out.println("the revesre of the given  is "+n);
	}

}
