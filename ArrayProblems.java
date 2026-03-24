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
		
		
		//  copy data from one array to another array
		
		String[] names1 = {"Java","Python","C","C++"};
		
		String[] names2 = new String[names1.length];
		
		for(int i=0;i<names1.length;i++) {
			names2[i] = names1[i];
		}
		
		
		// Swapping 
		
		int a = 10;
		int b = 20;
		
		int temp = a; // 10
		a = b; // 20 
		b = temp; // 10
		

				//	  i 			 j	
				//	  0, 1, 2, 3, 4, 5
		int[] arr = {10,20,30,40,50,60};
		
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
		
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--; // j-1 arr.length-1-1  // arr.length-2	
	
		}
		
		for(int data : arr) {
			System.out.print(data+" ");
		}
		
		System.out.println("");
		
		// Second Highest
		
		int[] array = {30,25,19,9,1,60};
		
		int Highest = arr[0];	//30
		int secondHighest = arr[0];	//30
		
		for(int i1=1;i1<array.length;i1++) {
			
			int ele = arr[i]; 
			
			if(ele != Highest) {
				
				if(ele > Highest) {
					secondHighest = Highest;
					Highest = ele;
				}else if(ele > secondHighest || Highest == secondHighest) {
					secondHighest = ele;
				}
			}
		}
		
		System.out.println("Highest : "+Highest);
		System.out.println("SecondHighest : "+secondHighest);
		
	}

}
