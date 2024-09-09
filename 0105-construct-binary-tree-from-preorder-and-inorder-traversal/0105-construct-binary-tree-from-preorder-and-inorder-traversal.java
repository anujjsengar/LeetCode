import java.util.HashMap;
import java.util.Map;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode build(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (inStart > inEnd || preStart >= preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = map.get(preorder[preStart]);
        int leftTreeSize = rootIndex - inStart;
        root.left = build(preorder, preStart + 1, inorder, inStart, rootIndex - 1, map);
        root.right = build(preorder, preStart + 1 + leftTreeSize, inorder, rootIndex + 1, inEnd, map);

        return root;
    }
}
