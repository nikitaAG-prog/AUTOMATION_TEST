package javainterview;

public class FindMissingArrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {-1,0,1,2,4,5,6,7,8,9,10};//sorted order it is 
int sum=0;
for(int i=0;i<a.length;i++) {//sum of num in arrays present
	sum= sum +a[i];
}System.out.println(sum);
//sum of all num and missing as well,j is number not indexing ,here num in array is in order sorted not random
int sum1=0;
for(int j=-1;j<=10;j++) {
	sum1 =sum1+j;
	
}System.out.println(sum1);

//print missing num by sum1-sum
System.out.println("missing number is ::"+ (sum1-sum));

	}

}
