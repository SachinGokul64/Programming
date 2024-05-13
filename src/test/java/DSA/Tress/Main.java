package DSA.Tress;

public class Main {

    public static void main(String[] args)
    {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);
        TraversalTechnique traversalTechnique = new TraversalTechnique();
        traversalTechnique. preOrderTraversal(binaryTree.root);
    }
}
