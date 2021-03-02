package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InsertTreeTest {

    @Test
    void addValueToRootOfEmptyTree() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree).isNotNull();
        assertThat(tree.getRoot()).isNotNull();
        assertThat(tree.isEmpty()).isFalse();
        assertThat(tree.getRoot().getData()).isEqualTo(50);
    }

    /*
                     50
             20              70
         5       35      59      92
     */
    @Test
    void createAThreeLevelTree() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(5);
        tree.insert(35);
        tree.insert(59);
        tree.insert(92);

        assertThat(tree).isNotNull();

        TreeNode root = tree.getRoot();
        checkSubTree(root, 50, 20, 70);
        checkSubTree(root.getLeftChild(), 20, 5, 35);
        checkSubTree(root.getRightChild(), 70, 59, 92);
        TreeNode node20 = root.getLeftChild();
        checkSubTree(node20.getLeftChild(), 5, null, null);
        checkSubTree(node20.getRightChild(), 35, null, null);
        TreeNode node70 = root.getRightChild();
        checkSubTree(node70.getLeftChild(), 59, null, null);
        checkSubTree(node70.getRightChild(), 92, null, null);
    }

    /*
                     50
             20              70
         5       35      59      92
     */
    @Test
    void createTheSameThreeLevelTreeButInDifferentOrder() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(70);
        tree.insert(20);
        tree.insert(59);
        tree.insert(92);
        tree.insert(35);
        tree.insert(5);

        assertThat(tree).isNotNull();

        TreeNode root = tree.getRoot();
        checkSubTree(root, 50, 20, 70);
        checkSubTree(root.getLeftChild(), 20, 5, 35);
        checkSubTree(root.getRightChild(), 70, 59, 92);
        TreeNode node20 = root.getLeftChild();
        checkSubTree(node20.getLeftChild(), 5, null, null);
        checkSubTree(node20.getRightChild(), 35, null, null);
        TreeNode node70 = root.getRightChild();
        checkSubTree(node70.getLeftChild(), 59, null, null);
        checkSubTree(node70.getRightChild(), 92, null, null);
    }

    @Test
    void createTreeWithDuplicateValueNodes() {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(70);
        tree.insert(70);
        tree.insert(20);
        tree.insert(20);
        tree.insert(50);

        TreeNode root = tree.getRoot();
        checkSubTree(root, 50, 20, 70);
        checkSubTree(root.getLeftChild(), 20, null, null);
        checkSubTree(root.getRightChild(), 70, null, null);
    }

    private void checkSubTree(TreeNode subtreeRoot, Integer dataRoot, Integer dataLeft, Integer dataRight) {
        assertThat(subtreeRoot.getData()).isEqualTo(dataRoot);

        TreeNode leftChild = subtreeRoot.getLeftChild();
        if(dataLeft!=null) {
            assertThat(leftChild.getData()).isEqualTo(dataLeft);
        }
        else {
            assertThat(leftChild).isNull();
        }

        TreeNode rightChild = subtreeRoot.getRightChild();
        if(dataRight!=null) {
            assertThat(rightChild.getData()).isEqualTo(dataRight);
        }
        else {
            assertThat(rightChild).isNull();
        }
    }
}