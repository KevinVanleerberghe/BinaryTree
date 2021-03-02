package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TraversalTreeLevelOrderTree {

    @Test
    void traversalLevelOrderOfEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree.traversalLevelOrder()).isEqualTo("");
    }

    @Test
    void traversalLevelOrderOfTreeWithOnlyRoot() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.traversalLevelOrder()).isEqualTo("50");
    }

    /*
                 50
         20                 70
     5                  59      92
                              100
   */
    @Test
    void traversalLevelOrderOfMultiLevelTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(59);
        tree.insert(92);
        tree.insert(100);

        assertThat(tree.traversalLevelOrder()).isEqualTo("50 20 70 5 59 92 100");
    }

    /*
                 50
         20              70
     5       35      59      92
   */
    @Test
    void traversalLevelOrderOfMultiLevelCompleteTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(35);
        tree.insert(59);
        tree.insert(92);

        assertThat(tree.traversalLevelOrder()).isEqualTo("50 20 70 5 35 59 92");
    }

    @Test
    void traversalLevelOrderOfMultiLevelUnbalancedTreeLeft() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);

        assertThat(tree.traversalLevelOrder()).isEqualTo("50 40 30 20 10 5");
    }

    @Test
    void traversalLevelOrderOfMultiLevelUnbalancedTreeright() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        assertThat(tree.traversalLevelOrder()).isEqualTo("5 10 20 30 40 50");
    }
}