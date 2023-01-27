package test05_stack;

import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		// Stack
		// - LIFO
		// - Stack 클래스 사용
		Stack<Integer> stack = new Stack<>();
		
		// stack에 0부터 9까지 순서대로 값 집언허기
		for(int i=0; i<10; i++) {
			stack.push(i);
		}
		
		// 스택에서 순서대로 값을 빼내기
		// - 가장 나중에 들어간 값이 가장 먼저 나오게 됨
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
