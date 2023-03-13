package stack;

public interface Stack {
	boolean isEmpty();
	boolean isFull();
	void push(int value);
	void pop();
	int peek();
	void clear();
	void printStack();
}
