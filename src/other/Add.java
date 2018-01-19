package other;

public class Add {
	/**
	 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
	 * @param num1
	 * @param num2
	 * @return
	 */
	  public int Add(int num1,int num2) {
		  while (num2!=0) {
	            int temp = num1^num2;   //异或  相当于不同位相加 相同位不做进位
	            num2 = (num1&num2)<<1;  //相与 找出相同位进行进一操作，如果都相同，完成赋值 推出循环
	            num1 = temp;          
	        }
	        return num1;
	    }
}
