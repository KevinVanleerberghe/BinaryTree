package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinTreeTest {

    @Test
    void getMinOfEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree.min()).isNull();
    }

    @Test
    void getMinOfTreeWithOnlyRoot() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.min()).isEqualTo(50);
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
        assertThat(tree.min()).isEqualTo(2);
    }

    @Test
    void getMinOfMultiLevelUnbalancedTreeLeft() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);
        assertThat(tree.min()).isEqualTo(5);
    }

    @Test
    void getMinOfMultiLevelUnbalancedTreeRight() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        assertThat(tree.min()).isEqualTo(5);
    }

}