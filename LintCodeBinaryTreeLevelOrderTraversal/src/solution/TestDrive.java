package solution;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		
		node1.left = node2;
		node1.right = node3;
		
		Solution sol = new Solution();
		
		System.out.println(sol.levelOrder(node1));
		
	}

}
