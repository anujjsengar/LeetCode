class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        if (dfs(head, root)) {
            return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    private boolean dfs(ListNode head, TreeNode node) {
        if (head == null) {
            return true;
        }
        if (node == null || node.val != head.val) {
            return false;
        }
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }
}
