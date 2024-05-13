package DSA.Tress;

public class TraversalTechnique {

    public void inOrderTraversal(TreeNode root)
    {

       if(root!=null)
       {
           inOrderTraversal(root.left);
           System.out.println(root.value);
           inOrderTraversal(root.right);
       }
    }

    public void preOrderTraversal(TreeNode root)
    {

        if(root!=null)
        {

            System.out.println(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }


}
