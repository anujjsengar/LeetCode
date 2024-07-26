public class Info {
    int diameter;
    int height;

    public Info(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}

class Solution {
    public Info fun(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftData = fun(root.left);
        Info rightData = fun(root.right);

        int currDiameter = Math.max(Math.max(leftData.diameter, rightData.diameter),
                leftData.height + rightData.height);
        int currHeight = Math.max(leftData.height, rightData.height) + 1;

        return new Info(currDiameter, currHeight);

    }

    public int diameterOfBinaryTree(TreeNode root) {
        Info ans = fun(root);
        return ans.diameter;
    }
}