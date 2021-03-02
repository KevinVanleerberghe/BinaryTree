package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TraversalTreeInOrderTest {

    @Test
    void traversalInOrderOfEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree.traversalInOrder()).isEqualTo("");
    }

    @Test
    void traversalInOrderOfTreeWithOnlyRoot() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.traversalInOrder()).isEqualTo("50");
    }

    /*
              50
         20         70
      5          59     92
                          100
    */
    @Test
    void traversalInOrderOfMultiLevelTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(59);
        tree.insert(92);
        tree.insert(100);

        assertThat(tree.traversalInOrder()).isEqualTo("5 20 50 59 70 92 100");
    }

    /*
                 50
         20              70
     5       35      59      92
   */
    @Test
    void traversalInOrderOfMultiLevelCompleteTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(35);
        tree.insert(59);
        tree.insert(92);

        assertThat(tree.traversalInOrder()).isEqualTo("5 20 35 50 59 70 92");
    }

    @Test
    void traversalInOrderOfMultiLevelUnbalancedTreeLeft() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);

        assertThat(tree.traversalInOrder()).isEqualTo("5 10 20 30 40 50");
    }

    @Test
    void traversalInOrderOfMultiLevelUnbalancedTreeright() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        assertThat(tree.traversalInOrder()).isEqualTo("5 10 20 30 40 50");
    }
}