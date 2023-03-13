package test;

public interface Stack {
	// stack
	// 하나의 자료구조 LIFO, 후입 선출
	
	// 1. isEmpty (boolean)
	boolean isEmpty();
	
	// 2. isFull (boolean)
	boolean isFull();
	
	// 3. push(value)
	void push(int value);
	
	// 4. pop (빼고 없애 줘)
	void pop();
	
	// 5. peek (빼지는 않고, 마지막에 들어온 값만 알려줘)
	void peek();
	
	// 6. clear (stack 안에 있는 값 모두 지워 줘.. 초기화)
	void clear();
	
	// 7. 출력문
	void printStack();
	
	
	
}
