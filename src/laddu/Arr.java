package laddu;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr= {5,8,7,6,2,9};
	System.out.println("The given array is: ");
	for(int num: arr) {
		System.out.println(num +" ");
	}
	Arrays .sort(arr);
	System.out.println("\n The sorted array is: ");
	for(int num:arr) {
		System.out.println(num +" ");
	}
	
	

				

	}

}
