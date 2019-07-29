public class SearchInABinarySearchTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val!=val){
            if (root.val>val){
                if (root.left!=null){
                    return searchBST(root.left,val);
                }
                else {
                    return null;
                }
            }
            else {
                if (root.right!=null){
                    return searchBST(root.right,val);
                }
                else {
                    return null;
                }
            }
        }
        else {
            return root;
        }
    }
}

/*
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        TreeNode left=searchBST(root.left,val);
        TreeNode right=searchBST(root.right,val);
        return left==null? right:left;

    }
}*/
