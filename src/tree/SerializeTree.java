package tree;


public class SerializeTree {
	/*
	 * 请实现两个函数，分别用来序列化和反序列化二叉树
	 * 
	 */
	public String Serialize(TreeNode root) {
        if(root == null)
            return "";
        StringBuilder sb = new StringBuilder();
        Serialize2(root, sb);
        return sb.toString();
    }
     
	public void Serialize2(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("#,"); //到空节点的时候添加#表示结尾
            return;
        }
        sb.append(root.val);
        sb.append(',');
        Serialize2(root.left, sb);  //将左子树先添加到序列中
        Serialize2(root.right, sb); //再将右子树添加到序列中
    }

	public TreeNode Deserialize(String str) {
		String[] arr = str.split(",");
		if (arr.length <= 0||str.length()==0)
			return null;
		return subDeserialize(arr);
	}
	int idx=-1;
	public TreeNode subDeserialize(String[] arr ) {
		idx++;
		if (idx<arr.length&&!arr[idx].equals("#")) {
			TreeNode root = new TreeNode(0);
			root.val = Integer.parseInt(arr[idx]);
			root.left = subDeserialize(arr);
			root.right = subDeserialize(arr);
			return root;
		}
		return null;

	}
}
