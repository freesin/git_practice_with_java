package stack;

public class Stack {
	int[] stackArray; 
	int top;
	int size;
	Stack(){
		
	}
	
	Stack(int s){
		size = s;
		stackArray = new int[size];
		top = 0;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return 0;
			
		}
		else if(isFull()) {
			System.out.println("stack is full");
			
		}
		return stackArray[top];
		
	}
	
	public boolean isFull() {
		return (top == size-1);
	}
	
	public boolean isEmpty() {
		return (top == 0);
		
	}
}
