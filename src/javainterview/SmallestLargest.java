package javainterview;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,47,11,34};
		int smallest=arr[0];
		int largest =arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
			else if(arr[i]>largest){
				
				largest=arr[i];
				
			}
		}System.out.println("number smallest is"+ " "+smallest );
		System.out.println("number largest is"+ " "+largest );
		
		
		
		
		
		
		
	}

}
