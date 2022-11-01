package loop;
import java.util.Scanner;


public class Sumofnnumbers {
private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,number,sum=0;
sc =new Scanner(System.in);
System.out.println("enter an number :");
number= sc.nextInt();
for(i=1;i<=number;i++)
{
	sum=sum+i;
}
System.out.println("sum of first 100 Natural numbersis="+sum );



	}

}
