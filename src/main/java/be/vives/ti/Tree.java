package be.vives.ti;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (isEmpty()) {
            root = new TreeNode(value);
        }
        else {
            TreeNode tempNode = root;
            boolean stop = false;
            while(!stop){
                if(value < tempNode.getData()){
                    if(tempNode.getLeftChild() == null){
                        tempNode.setLeftChild(new TreeNode(value));
                        stop = true;
                    }
                    else {
                        tempNode = tempNode.getLeftChild();
                    }
                }
                else if(value > tempNode.getData()){
                    if(tempNode.getRightChild() == null){
                        tempNode.setRightChild(new TreeNode(value));
                        stop = true;
                    }
                    else {
                        tempNode = tempNode.getRightChild();
                    }
                }
                else {
                    stop = true;
                }
            }
        }
    }

    public TreeNode search(int value){
        TreeNode tempNode = root;
        while(tempNode != null) {
            if(tempNode.getData() == value){
                return tempNode;
            }
            else if(value < tempNode.getData()){
                tempNode = tempNode.getLeftChild();
            }
            else {
                tempNode = tempNode.getRightChild();
            }
        }
        return tempNode;
    }

    public Integer min(){
        if (!isEmpty()) {
            TreeNode tempNode = root;
            while (tempNode.getLeftChild() != null) {
                tempNode = tempNode.getLeftChild();
            }
            return tempNode.getData();
        }
        return null;
    }

    public Integer max(){
        if (!isEmpty()) {
            TreeNode tempNode = root;
            while (tempNode.getRightChild() != null) {
                tempNode = tempNode.getRightChild();
            }
            return tempNode.getData();
        }
        return null;
    }

    // Depth first
    public String traversalPreOrder(){
        if (isEmpty()) {
            return "";
        }

        Deque<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
            TreeNode teverwerken = stack.removeFirst();
            sb.append(teverwerken.getData()).append(" ");
            if(teverwerken.getRightChild() != null){
                stack.addFirst(teverwerken.getRightChild());
            }
            if(teverwerken.getLeftChild() != null){
                stack.addFirst(teverwerken.getLeftChild());
            }
        }
        return sb.toString().trim();
    }

    public String traversalLevelOrder(){
        if (isEmpty()) {
            return "";
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        StringBuffer sb = new StringBuffer();
        while(!deque.isEmpty()){
            TreeNode teverwerken = deque.removeFirst();
            sb.append(teverwerken.getData()).append(" ");
            if(teverwerken.getLeftChild() != null){
                deque.addLast(teverwerken.getLeftChild());
            }
            if(teverwerken.getRightChild() != null){
                deque.addLast(teverwerken.getRightChild());
            }

        }
        return sb.toString().trim();
    }

    public String traversalInOrder() {
        Deque<TreeNode> todo = new ArrayDeque<>();
        TreeNode currentNode = root;
        StringBuffer sb = new StringBuffer();

        while (!todo.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                todo.addFirst(currentNode);
                currentNode = currentNode.getLeftChild();
            } else {
                TreeNode node = todo.remove();
                sb.append(" ").append(node.getData());
                currentNode = node.getRightChild();
            }
        }
        return sb.toString().trim();
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public TreeNode getRoot() {
        return root;
    }

}
