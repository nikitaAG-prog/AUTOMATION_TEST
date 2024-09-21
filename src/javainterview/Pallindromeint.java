package javainterview;

import java.util.Scanner;

public class Pallindromeint {

	public static void main(String[] args) throws Exception{
		// take input 
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a  number :"); 
		long num= sc.nextLong();
		long original =num;
long rev=0;
while(num!=0) {
	
	rev=rev*10+ num%10;//it gives rem 3,rev is 0 so 0*10
	num=num/10;//num =12345278 / it gives quotient
              }
if(original==rev) {
	System.out.println("is palin");
}
else {
	System.out.println("not palin");
}


	
//2ndMETHOD
//long num1=num;
//System.out.println(new StringBuffer(String.valueOf(num)).reverse());//makes long as string
	
}

}
