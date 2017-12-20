package math;

public class ExponentOfBase {
	/**
	 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
	 */
	public double Power(double base, int exponent) {
		double t=base;
		if(exponent<0) {
			base=1/base;
			t=base;
			exponent=Math.abs(exponent);
		}else if(exponent==0)
			return 1;
		while(--exponent>0) base*=t; 
		return base;
	}
}
