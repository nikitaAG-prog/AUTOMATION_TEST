package javainterview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Knowvowel {
   public static void main( String args[] ) {
      String regex = "[aeiouAEIOU]";
      System.out.println("Enter input string: ");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      //Compiling the regular expression
      Pattern.compile(regex);
      //Compiling the regular expression
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);
      int count=0;
      if(matcher.find()) {
         System.out.println("The input string contains vowels");
      count++;
      
      
      } else {
         System.out.println("The input string does not contain vowels");
      }
   
		System.out.println(count);
	}

}
