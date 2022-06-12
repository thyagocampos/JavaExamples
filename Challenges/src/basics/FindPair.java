package basics;

import java.util.Arrays;

public class FindPair {

	private int[] _arr;
	private int _target;
	
	FindPair(int[] Arr, int Target){
		_arr = Arr;;
		_target = Target;		
	}
	
	public String ReturnPair() {

		//sort arr ascending 
		Arrays.sort(_arr);
		
		//create and low index
		int low = 0;
		
		//create and high index 
		int high = _arr.length -1;			
		
				
		while(low <= high) {
			
			//sum both index, high and low and check if they match with target
			if(_arr[low]+_arr[high]==_target) {
				System.out.println(
						String.valueOf(_arr[low])+ " + " +
						String.valueOf(_arr[high])+ 
						" = "  +
						String.valueOf(_arr[low]+_arr[high])
						);
				
				return "Found";
			}
			
			//we increment low index in case of the sum is lower than target
			if(_arr[low]+_arr[high]<_target) {
				low++;
			}
			
			//we decrement high index in case of the sum is highter than target
			if(_arr[low]+_arr[high]>_target) {
				high--;
			}					
		}
		
		return "Not found";
	}	

}
