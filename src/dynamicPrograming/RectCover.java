package dynamicPrograming;

public class RectCover {
	/**
	 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
	 * @param target
	 * @return
	 */
	public int RectCover(int target) {
		if(target==0) {
			return 0;
		}
		if(target==1||target==2) {
			return target;
		}
		return RectCover(target-1)+RectCover(target-2);
    }
}