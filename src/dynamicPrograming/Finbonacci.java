package dynamicPrograming;

public class Finbonacci {
	// 1 1 2 3 5 8 13 21  此题类似于上阶梯 都属于斐波那契数列
	public int Fibonacci(int n) {
		if (n == 0)
			return n;
		int result = 1, last = 0;
		int i = 1;
		while (i < n) {

			int temp = result + last;
			last = result;
			result = temp;
			i++;
		}
		return result;
	}
}