package string;

public class StringToInt {
	/**
	 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
	 * 
	 * @param str
	 * @return
	 */
	public int StrToInt(String str) {
		int res = 0, i = str.toCharArray().length-1, time = 1;
		while (i >=0) {
			if(str.charAt(i)=='+')
			{
				i--;
				continue;
			}
			else if(str.charAt(i)=='-') {
				res=-res;
				i--;
				continue;
			}else if (str.charAt(i) - 48 >= 10 || str.charAt(i) - 48 < 0) {
				res = 0;
				break;
			}
			res += (str.charAt(i--) - 48) * time;
			time *= 10;
		}

		return res;
	}
}
