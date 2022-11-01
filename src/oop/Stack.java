package oop;

public class Stack {
	int S[]=new int[10];
	int tos;
	Stack(){
		tos=-1;
		
	}
	void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Stack is full ");
			
		}
		else
			S[++tos]=item;
		
	}
	int pop(){
		if(tos>=0) {
			return S[tos -1];}
		
			else
			{
				System.out.println("Stack is empty");
				return-1;
				
		}
		
	}
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
