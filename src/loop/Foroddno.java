package loop;
import java.util.Scanner;


public class Foroddno {
private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number,i;
sc = new Scanner(System.in);
System.out.println("please  Enter any number:");
number= sc.nextInt();
for(i=1;i<=number;i++) {
	if(i%2!=0)
	
	{
		System.out.println(i+"\t");
	}
}
	}

}
