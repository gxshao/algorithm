package Stack;

import java.util.Stack;

public class OrderOfStack {
	/**
	 * 输入两个整数序列，第一个序列表示栈的压入顺序， 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
	 * 例如序列1,2,3,4,5是某栈的压入顺序， 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
	 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if(pushA.length==0||popA.length==0) {
			return false;
		}
		Stack<Integer> mStack=new Stack<Integer>();
		int j=0;
		for(int i=0;i<pushA.length;i++) {                      //依次先入栈
			mStack.push(pushA[i]);                               
			while(j<popA.length&&mStack.peek()==popA[j]) {    //按照栈顶元素和对应的出栈顺序比较：栈顶元素与出栈顺序相等则依次出栈，否则继续入栈 ！！
				mStack.pop();						
				j++;
			}
		}
		return mStack.isEmpty();  //如果依次出栈完成 则证明序列匹配
		
	}
}
