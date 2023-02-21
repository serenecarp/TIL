package stack;

import java.util.Arrays;

public class MyMyStack implements Stack {
	// Array를 활용해서 구현해봅시다

	public static void main(String[] args) {
		// 오랜만이야 생성자 :)
		MyMyStack myStack = new MyMyStack(5);
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		myStack.push(123);
		myStack.printStack();
		System.out.println(myStack.peek());
		myStack.push(555);
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.peek());
		myStack.push(4);
		myStack.push(4);
		myStack.push(4);
		myStack.push(4);
		myStack.push(4);
		System.out.println(myStack.isFull());
		myStack.clear();
		myStack.printStack();
		myStack.clear();
		myStack.pop();
		System.out.println(top);
	}

	static int top; // 스택의 포인터
	static int N; // 스택의 크기
	static int stack[]; // 스택

	// 생성자를 활용해서 스택 생성
	public MyMyStack(int stackSize) {
		top = -1; // 스택 포인터 초기화
		N = stackSize;
		stack = new int[N]; // 스택 생성
	}

	public boolean isEmpty() {
		// hint: 스택 포인터가 -1이면.. 데이터가 없는 경우 일 것.
		// 조건 1: isEmtpy -> true
		if (top == -1)
			return true;

		// 조건 2: not empty -> false
		else
			return false;
	}

	public boolean isFull() {
		// hint: 스택 포인터 == 전체크기 -1이면.. 꽉 차 있는 것
		// 조건 1: isFull -> true
		if (top == N - 1)
			return true;
		// 조건 2: not full -> false
		else
			return false;

	}

	public void push(int value) {
		// 조건 1: isFull하면, 더이상 넣을 수 없다.
		if (isFull()) {
			System.out.printf("입력값을 넣지 못했습니다. (%d)\n", value);
			return;
		}
		// 조건 2: 빈 공간이 있다면, 값을 추가할 수 있다.
		else
			stack[++top] = value;

	}

	public void pop() {
		// 조건 1: isEmpty하면 뽑아낼 것들이 없다.
		if (isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return;
		}
		// 조건 2: 하나라도 있으면 뽑아낼 수 있다.
		else
			stack[top--] = 0; // ??
	}

	public int peek() {
		// 조건 1: isEmpty하면 보여줄 것들이 없다.
		if (isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return -1111; // ??
		}
		// 조건 2: 하나라도 값이 있으면 보여줄 수 있다.
		else
			return stack[top];
	}

	public void clear() {
		// 조건 1: isEmpty -> 지울게 없다.
		if (isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
			return;
		}
		// 조건 2: 초기화한다. (반복문쓰지 말것)
		else {
			pop();
			clear();
		}
	}

	public void printStack() {

		System.out.println(Arrays.toString(stack));
	}

}
