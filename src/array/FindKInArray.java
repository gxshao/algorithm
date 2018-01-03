package array;

import java.util.ArrayList;

public class FindKInArray {
	/** 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。 */
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> arr = new ArrayList<>();
		boolean [] visited=new boolean[input.length];
		int min=Integer.MAX_VALUE;
		if(k>input.length)
			return arr;
		while(k-->0) {
			int pos=0;
			for(int i=0;i<input.length;i++) {
				if(input[i]<min&&!visited[i]) {
					min=input[i];
					pos=i;
				}
			}
			arr.add(min);
			visited[pos]=true;
			min=Integer.MAX_VALUE;
		}
		return arr;
	}
}
