package javainterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]= {"java","ruby","c","java","js"};
//method 1.compare each element not good method on square is time complexity
for(int i=0;i<names.length;i++) {
	for(int j=i+1;j<names.length;j++) {
		if(names[i].equals(names[j])) {
		System.out.println("duplicate is "+ names[i]);}
	}
	
}System.out.println("*************************");
//method 2....
//proper solution is using hashset:part of java collection it stores unique value
//create set(inteface) object,hashset is class
Set<String> store= new HashSet<String>();
for(String name:names) {
	if(store.add(name)==false) {//y hashset m ek ek kr k names ko store kr dega
		System.out.println(name+"duplicacy");
	}
	//3rd by hash map but we have not used it stores duplicate values in key value
	
}









}

}
