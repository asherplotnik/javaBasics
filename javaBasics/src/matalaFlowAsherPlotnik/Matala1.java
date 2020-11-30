package matalaFlowAsherPlotnik;

import java.util.Arrays;

public class Matala1 {
	public static void main(String[] args) {
		
		// first task
		int[] nums1 = new int[15]; 
		int[] nums2 = new int[15]; 
		
		for (int i = 0; i < nums1.length; i++) {
			nums1[i]= (int)(Math.random()*10);
		}
		for (int i = 0; i < nums2.length; i++) {
			nums2[i]= (int)(Math.random()*10);
		}
		
		// second task
		
		System.out.println("nums1: " + Arrays.toString(nums1));
		System.out.println("nums1: " + Arrays.toString(nums2));
		
		// third task
		
		int maxDigit = 0;
		int maxNum = 0; 
		for (int i = 0; i < nums1.length-2; i++) {
			if (maxDigit < nums1[i]) {
				maxDigit = nums1[i];
				maxNum = createTriNumber(nums1,i);
			} else if ( maxDigit == nums1[i]) {
				int tempNum = createTriNumber(nums1,i);
				if (maxNum < tempNum) {
					maxNum = tempNum;
				}
			}
		}
		System.out.println("Biggest 3 digit number is in nums1: " + maxNum);
		
		
		//forth and fifth tasks
		
		int[] distinct = new int[10];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}
		
		int index = 0;
		for (int i = 0; i < nums1.length; i++) {
			boolean foundAtNums2 = false;
			for (int j = 0; j < nums2.length; j++) {
				if  (nums1[i] == nums2[j]) {
					foundAtNums2 = true;
					break;
				}
			}
			if (!foundAtNums2 && !checkDuplicateBefore(nums1,i)) {
				distinct[index++] = nums1[i];
			}
		}
		
		for (int i = 0; i < nums2.length; i++) {
			boolean foundAtNums1 = false;
			for (int j = 0; j < nums1.length; j++) {
				if  (nums1[j] == nums2[i]) {
					foundAtNums1 = true;
					break;
				}
			}
			if (!foundAtNums1 && !checkDuplicateBefore(nums2,i)) {
				distinct[index++] = nums2[i];
			}
		}
			
		System.out.println("distinct array: " + Arrays.toString(distinct));
		
		
		// sixth task
		
		long distinctNum =0L;
		int i = distinct.length-1;
			
		for ( ;i >= 0; i--) {
			if (distinct[i] != -1) 	{
				distinctNum  += distinct[i];	
				if (i>0)
					distinctNum *= 10;

			}
		}
				
		System.out.println("number from array distinct:" + distinctNum);
	}
	
	
	
	public static int createTriNumber(int[] arr, int i) {
		return arr[i]*100 + arr[i+1]*10 + arr[i+2] ;
	}
	
	public static boolean checkDuplicateBefore (int[] arr , int i) {
		if ( i == 0 ) {
			return false;
		} else {
			for (int j = 0; j < i; j++) {
				if( arr[j] == arr[i]) {
					return true;
				}
			}
		}
		return false;
	}

}
