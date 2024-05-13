package DSA.Tress;

public class BinaryTree {
    TreeNode root;
    public BinaryTree()
    {
        root = null;
    }

    public void  insert(int data)
    {
        root = insertData(root,data);
    }

    public TreeNode insertData(TreeNode root, int data)
    {
        if(root == null)
        {
            root = new TreeNode(data);
        }

        if(data < root.value)
        {
            root.left = insertData(root.left, data);
        } else if (data > root.value) {
            root.right = insertData(root.right, data);
        }

        return root;
    }
}
