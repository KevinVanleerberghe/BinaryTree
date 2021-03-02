package be.vives.ti;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isInternalNode(){
        return leftChild != null || rightChild != null;
    }

    public boolean isLeaf(){
        return leftChild == null && rightChild == null;
    }
}
