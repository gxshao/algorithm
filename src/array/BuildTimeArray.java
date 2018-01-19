package array;

public class BuildTimeArray {
	/**
	 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
	 * 
	 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
	 * 
	 * @param A
	 * @return
	 */
	public int[] multiply(int[] A) {
		int[] arr = new int[A.length];
		for(int i=0;i<A.length;i++) {
			arr[i]=1;
			for(int j=0;j<A.length;j++) {
				if(j==i)
					continue;
				arr[i]*=A[j];
			}
		}
		return arr;
	}
	
}
