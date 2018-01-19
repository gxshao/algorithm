package other;

public class OntToN {
		/**
		 * 求1+2+3+...+n，
		 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
		 */
	public int Sum_Solution(int n) {
		
      return sum(n,n-1);
    }
	public int sum(int origin,int cur) {
		if(cur==0)
			return origin;
		return sum(origin+cur,cur-1);
	}
}
