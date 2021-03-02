package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TraversalTreePreOrderTest {

    @Test
    void traversalPreOrderOfEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree.traversalPreOrder()).isEqualTo("");
    }

    @Test
    void traversalPreOrderOfTreeWithOnlyRoot() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.traversalPreOrder()).isEqualTo("50");
    }

    /*
             50
        20         70
     5         59      92
                         100
   */
    @Test
    void traversalPreOrderOfMultiLevelTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(59);
        tree.insert(92);
        tree.insert(100);

        assertThat(tree.traversalPreOrder()).isEqualTo("50 20 5 70 59 92 100");
    }

    /*
                 50
         20              70
     5       35      59      92
   */
    @Test
    void traversalPreOrderOfMultiLevelCompleteTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(35);
        tree.insert(59);
        tree.insert(92);

        assertThat(tree.traversalPreOrder()).isEqualTo("50 20 5 35 70 59 92");
    }

    @Test
    void traversalPreOrderOfMultiLevelUnbalancedTreeLeft() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);

        assertThat(tree.traversalPreOrder()).isEqualTo("50 40 30 20 10 5");
    }

    @Test
    void traversalPreOrderOfMultiLevelUnbalancedTreeright() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        assertThat(tree.traversalPreOrder()).isEqualTo("5 10 20 30 40 50");
    }
}