package loop;

public class Pyramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
for(i=0;i<=5;i++) {
	for(j=5-i;j>1;j--) {
		System.out.println("");
		}
	for(j=0;j<=i;j++) {
		System.out.println("*");
	}
	System.out.println();
}
	}

}
