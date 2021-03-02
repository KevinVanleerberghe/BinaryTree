package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void isNotInternalNode() {
        TreeNode treeNode = new TreeNode(15);
        assertThat(treeNode.isInternalNode()).isFalse();
        assertThat(treeNode.isLeaf()).isTrue();
    }

    @Test
    void isInternalNode_onlyLeftChild() {
        TreeNode treeNode = new TreeNode(15);
        treeNode.setLeftChild(new TreeNode(10));
        assertThat(treeNode.isInternalNode()).isTrue();
        assertThat(treeNode.isLeaf()).isFalse();
    }

    @Test
    void isInternalNode_onlyRightChild() {
        TreeNode treeNode = new TreeNode(15);
        treeNode.setRightChild(new TreeNode(20));
        assertThat(treeNode.isInternalNode()).isTrue();
        assertThat(treeNode.isLeaf()).isFalse();
    }

    @Test
    void isInternalNode_bothChildren() {
        TreeNode treeNode = new TreeNode(15);
        treeNode.setLeftChild(new TreeNode(10));
        treeNode.setRightChild(new TreeNode(20));
        assertThat(treeNode.isInternalNode()).isTrue();
        assertThat(treeNode.isLeaf()).isFalse();
    }

}