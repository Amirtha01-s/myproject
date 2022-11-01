package methods;

public class Box {
static int boxvolume(int length,int breadth,int height ) {//method definition
	int volume;
	volume=length*breadth*height;
	return volume;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int volume= boxvolume(10,4,6);//passing arguments
System.out.println(volume);
	}

}
