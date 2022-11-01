package laddu;

public class Return {
	public int CompareNum(int x,int y)
	{
		System.out.println("x="+x+"\ny="+y);
		if(x>y)
			return x;
		else
			return y;
	}
	
	
	public static void main(String[] args) {
	Return obj=new Return();
	int result =obj.CompareNum(15,24);
	System.out.println("The greater number among x and y is:"+result);
		

	}

}
