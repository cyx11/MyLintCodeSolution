package solution;

import java.util.ArrayList;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        if (root == null) {
            return new ArrayList();
        }
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        int pos = 0;
        list.add(root);
        list.add(new TreeNode(-1));
        while (pos < list.size()) {
        	for (int i = 0; i < list.size(); i++) {
        		System.out.print(list.get(i).val);
        	}
        	System.out.println();
            TreeNode node = list.get(pos);
            pos++;
            if (node.val == -1) {
                rst.add(new ArrayList<Integer>(level));
                level = new ArrayList<Integer>();
                if (pos == list.size()) {
            		break;
            	}
                list.add(new TreeNode(-1));
                continue;
            }
            level.add(node.val);
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }           
        }
        return rst;
    }
	
}
