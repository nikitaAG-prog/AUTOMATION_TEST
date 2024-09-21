package javainterview;

import java.util.Scanner;

public class PalinString {

	public static void main(String[] args) {
	//Scanner sc =new Scanner(System.in);
	//System.out.println("enter a string :");
String s= "madam";
String rev="";
int length = s.length();
for (int i=length-1;i>=0;i--) {
	rev= rev+s.charAt(i);
	
}

if(rev==s) {
	System.out.println("palindrome!!");
}

	}

}
