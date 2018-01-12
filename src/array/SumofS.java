package array;

import java.util.ArrayList;

public class SumofS {
	/**
	 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
	 * 
	 * @param array
	 * @param sum
	 * @return
	 */
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list=new ArrayList<>();
		int head=0,tail=array.length-1;
		int min=Integer.MAX_VALUE;
		if(array.length<=0)
			return list;
		while(head<tail) {
			System.out.println(head+"     "+tail);
			int temp=array[head]+array[tail];
			if(temp==sum) {
				if(array[head]*array[tail]<min)
				{
					min=array[head]*array[tail];
					list.clear();
					list.add(array[head]);
					list.add(array[tail]);
				}
				head++;
				tail--;
			}else if(temp<sum){
				head++;
			}else {
				tail--;
			}
		}
		return list;
	}
}
