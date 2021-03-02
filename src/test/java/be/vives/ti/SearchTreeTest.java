package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchTreeTest {

    @Test
    void searchInEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree.search(50)).isNull();
    }

    @Test
    void searchInTreeWithOnlyRoot() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.search(50)).isNotNull();
        assertThat(tree.search(50).getData()).isEqualTo(50);
    }

    @Test
    void searchInTreeWithOnlyRoot_notFound() {
        Tree tree = new Tree();
        tree.insert(50);
        assertThat(tree.search(80)).isNull();
    }

    @Test
    void searchInMultiLevelTree() {
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

        assertThat(tree.search(14)).isNotNull();
        assertThat(tree.search(14).getData()).isEqualTo(14);

        assertThat(tree.search(70)).isNotNull();
        assertThat(tree.search(70).getData()).isEqualTo(70);
    }

    @Test
    void searchInMultiLevelTree_notFound() {
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

        assertThat(tree.search(46)).isNull();
    }
}