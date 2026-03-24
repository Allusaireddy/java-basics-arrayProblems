package arrays;

public class ArrayProblems {
	
	public static void main(String[] args) {
		
		int[] nums = {20,10,40,11};
		
		// print for-each, for
		
		for(int data : nums) {
			System.out.print(data+" ");
		}
		
		System.out.println();
		
		// sum and product of elements in an array
		
		int sum = 0;
		int prod = 1;
		for(int data : nums) {
			sum += data;
			prod *= data;
		}
		System.out.println("Sum:"+sum);
		System.out.println("Product:"+prod);
		
		
		// Highest element
		
		int highest = nums[0];
		for(int ele : nums) {
			if(ele > highest) {
				highest = ele;  
			}
		}
		System.out.println(highest);
		
		
		// Lowest Element
		
		int lowest = nums[0];
		for(int ele : nums) {
			if(ele < lowest) {
				lowest = ele;
			}
		}
		System.out.println(lowest);
		
		
		int high = nums[0];
		int low = nums[0];
		
		for(int ele : nums) {
			if(high==low && high == ele) 
				continue;
				
			if(ele > high)
				high = ele;
			if(ele < low)
				low = ele;
			
		}
		
		System.out.println("Highest: "+high+", lowest :"+low);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
