package loop;
import java.util.Scanner;
public class Factorialofn {
	private static Scanner sc;
	public static void main(String[] args) {
		
		int fact=1,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a numbers:");
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		// TODO Auto-generated method stub
System.out.println(fact);
	}

}
