package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTreeTest {

    @Test
    void getMinOfEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree.max()).isNull();
    }

    @Test
    void getMinOfTreeWithOnlyRoot() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.max()).isEqualTo(50);
    }

    @Test
    void getMinOfMultiLevelTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(70);
        tree.insert(20);
        tree.insert(59);
        tree.insert(22);
        tree.insert(14);
        tree.insert(2);
        tree.insert(83);
        tree.insert(14);
        tree.insert(5);
        assertThat(tree.max()).isEqualTo(83);
    }

    @Test
    void getMaxOfMultiLevelUnbalancedTreeLeft() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);
        assertThat(tree.max()).isEqualTo(50);
    }

    @Test
    void getMaxOfMultiLevelUnbalancedTreeRight() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        assertThat(tree.max()).isEqualTo(50);
    }

}