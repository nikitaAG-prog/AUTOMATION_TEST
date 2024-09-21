 rev   st  package javainterview;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="madam";
		String rev="";
//	//METHOD1	
//		// reverse is not available it is not function in string class
//		//string it is immutable object
//		int leng =s.length();//stores length of string
//		//start for from 7 ie len -1 for reverse starts from m
//		for(int i=leng-1;i>=0;i--) {
//		rev=rev+s.charAt(i);//append with rev and store in rev
//			
//			
//		}System.out.println(rev);
//		
	//2.METHOD
		StringBuffer sf =new StringBuffer(s);//object creation with stringbuffer class and it is reversable muttable
		System.out.println(sf.reverse());
		 
		
		System.out.println( rev);
		
		if(sf.reverse().equals(sf)) {
			System.out.println("palindrome!!");
		}
		
		
		

	}

}
