package solution;

public class Solution {
	
	/**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
	// version1: traverse
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> rst = new ArrayList<Integer>();
        traverse(root, rst);
        return rst;
    }
    
    private void traverse(TreeNode node, ArrayList<Integer> rst) {
        if (node == null) {
            return;
        }
        rst.add(node.val);
        traverse(node.left, rst);
        traverse(node.right, rst);
    }
    
    //version2: Loop
    
	
}
