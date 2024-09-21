package javainterview;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long num=123452783;//or long 
long rev=0;
while(num!=0) {
	
	rev=rev*10+ num%10;//it gives rem 3,rev is 0 so 0*10
	num=num/10;//num =12345278 / it gives quotient
	
}System.out.println("reversed num is " + rev);
	
//2ndMETHOD
long num1=890;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());//makes long as string


	
	}

}
