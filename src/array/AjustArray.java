package array;

public class AjustArray {
	/**
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数
	 * 组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位 置不变。
	 */
	public void reOrderArray(int[] array) {
		int[] arr=new int[array.length];
		int i=0;
		for(int x:array)
			if(x%2==1)
				arr[i++]=x;
		for(int y:array)
			if(y%2==0)
				arr[i++]=y;
		i=0;
		for(int k:arr)
			array[i++]=k;
	}
}
