package stack;

public class Stack {
		int top=0;//ó�� ��ü �����ϸ� �ƹ��͵� ���⿡ top�� 0�̴�.
		
	Stack(){//��ü�� �����ϴ� ���� �Ķ���͸� �������� ������ dafault�� ������ 10 �迭�� �����ϰ� �迭�� 0��° ���� ž���� �����س��´�.

		int [] stackArray = new int[10];
		stackArray[0]=top;
		top = stackArray[0];
	}
	Stack(int size){//�Ķ���͸� �������� ��.
	
			int [] stackArray = new int[size];
		
		stackArray[0]=top;
		top = stackArray[0];
	}
	public int search(int data)//data���� �´� �迭 �� (index)�� ã�� �����Ѵ�.
	{
		int count = top;
		if(top!=0)
			while(stackArray[count]!=data)
			{
				count--;
			}
		return count;
	}
	
	public boolean isEmpty() {
		if(head == null)
			System.out.println("stack is empty");
		return true;
}
