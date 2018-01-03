package string;

import java.util.HashMap;
import java.util.Map;

public class FirstMerge {
	/**
	 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
	 * @param str
	 * @return
	 */
	public int FirstNotRepeatingChar(String str) {
		if(str.length()==0)
			return -1;
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
		}
		int pos=Integer.MAX_VALUE;
		for(Character key:map.keySet()) {
			System.out.println(map.get(key)+"  "+key);
			if(map.get(key)==1)
			{
				int c=str.indexOf(key);
				pos=c<pos?c:pos;
			}
		}
        return pos;
    }
}
