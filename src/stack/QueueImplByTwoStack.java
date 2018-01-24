package stack;

import java.util.Stack;

public class QueueImplByTwoStack {
	Stack<Integer> in = new Stack<Integer>();
	Stack<Integer> out = new Stack<Integer>();
	
	public void push(int node) {
		in.push(node);
	}
	
	public int pop() {
		while(!in.isEmpty()) {
			out.push(in.pop());
		}
		
		int result= out.pop();
		while(!out.isEmpty()) {
			in.push(out.pop());
		}
		return result;
	}
}
