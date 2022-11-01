package loop;
import java.util.Scanner;
import java.math.*;
public class Armstrongnumber {
	
	//sum of cubes of a digit of any number is equal to the number is known as armstrong number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		while(n>=0) {
			temp=n%10;
			temp=math.pow(temp,n);
		 Armstrongnumber = Armstrongnumber+temp;
			n=n/10;
			
			
		}
		if(Armstrong==original)
			System.out.println("Armstrong");
		else
			System.out.println("not a armstrong ")
		
		

	}

}
