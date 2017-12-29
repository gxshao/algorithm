package string;

import java.util.ArrayList;

public class OrderString {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> array = new ArrayList<String>();
		if (str.length() <= 0) {
			return array;
		}
		StringBuffer sb = new StringBuffer();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		backtrack(array, str, 0, sb,arr);
		return array;
	}

	private void backtrack(ArrayList<String> array, String str, int cur, StringBuffer sb,ArrayList<Integer> arr) {

		System.out.println(sb.length() +"    "+sb.toString());
		if (str.length() == sb.length() && !array.contains(sb.toString())) {
			array.add(sb.toString());
			return;
		}
		for (int j = 0; j < str.length(); j++) {
			if(arr.contains(j))
				continue;
			sb.append(str.charAt(j));
			arr.add(j);
			backtrack(array, str, j + 1, sb,arr);
			arr.remove((Integer)j);
			sb.deleteCharAt(sb.length() - 1);
		}

	}
}
