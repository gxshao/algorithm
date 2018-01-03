package array;

public class CountNumOfArray {
	/**
	 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字
	 * 2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
	 * 
	 * @param array
	 * @return
	 */
	public int MoreThanHalfNum_Solution(int[] array) {
		int res = 0;
		int max=Integer.MIN_VALUE;
		boolean[] visited=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if(!visited[i]) {
				int count=0;
			
				for(int j=0;j<array.length;j++) {
					if(array[i]==array[j])
					{
						visited[j]=true;
						count++;
					}
				}
				if(count>max) {
					max=count;
					res=i;
				}
			}
		}
		return max>(array.length/2)?array[res]:0;
	}
}
