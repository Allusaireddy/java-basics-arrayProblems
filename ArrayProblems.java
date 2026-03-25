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



		// Rotations 
		
		int[] a = {10,20,30,40};
		
		//{20,30,40,10}
		//{30,40,10,20}
		//{40,10,20,30}
		//{10,20,30,40} 4th - original array
		//{20,30,40,10} 5th - 1
		//{30,40,10,20} 6th - 2
		//{40,10,20,30} 7th - 3
		//{10,20,30,40} 8th - original
		
		int n =2;
		int totalTimes = n%a.length;
		
		for(int j=1;j<=totalTimes;j++) {
			
			int temp = a[0];
			for(int i=1;i<=a.length-1;i++){
				a[i-1] = a[i];
			}
			a[a.length-1] = temp;	
		}
		
		for(int data : a) {
			System.out.print(data+" ");
		}


		
		int[] a = {10,20};
		
		// calculate first highest along with second highest
		
		int highestElement = a[0]; //20
		int secondHighestElement = a[0]; //10
		
		// 30
		
		for(int data : a) {

			if(a[1]>highestElement) {
				secondHighestElement = highestElement;
				highestElement = a[1];
			}
		}
	
		System.out.println(highestElement);
		System.out.println(secondHighestElement);
		
		
		
		int[] a = {10,20,11,13};
		
		int hEle1 = a[0];
		int hEle2 = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			int value = a[i];
			
			if(value == hEle1) 
				continue;
				
				if(value > hEle1) {
					hEle2 = hEle1;
					hEle1 = value;
				}
				else if(value > hEle2){
					hEle2 = value;
				}
			
		}
		
		System.out.println("Highest : "+hEle1);
		System.out.println("Secondhighest : "+hEle2);
		
		

		// Rotations
		
//		int[] a = {10,20,30,40};
//		int n = 1;
		
			// CLOCKWISE ROTATION
		// 1 - {20,30,40,10}
		// 2 - {30,40,10,20} 
		// 3 - {40,10,20,30}
		// 4 - {10,20,30,40}
		// 5 - {20,20,40,10} - 1st rotation array
		
		
//		for(int j=1;j<=n%a.length;j++) {
//			
//			int temp = a[0];
//			
//			for(int i=1;i<a.length;i++) {
//				a[i-1] = a[i];
//			}
//			
//			a[a.length-1] = temp;
//		}
//		
//		for(int data : a) {
//			System.out.print(data+" ");
//		}
		
		
		
		int[] a = {10,20,30,40};
		int n = 5;
		
			//ANTI-CLOCKWISE DIRECTION
//		1 - {40,10,20,30}
//		2 - {30,40,10,20}
//		3 - {20,30,40,10}
//		4 - {10,20,30,40}
		
		
		int rotations = n % a.length;
				
		for(int j=0;j<rotations;j++) {
			
			int temp = a[a.length-1];
			
			for(int i=a.length-1;i>0;i--) {
				a[i] = a[i-1];
			}
			
			a[0] = temp;
			
		}
		
		for(int data : a) {
			System.out.print(data+" ");
		}
		

		
		
	}

}
