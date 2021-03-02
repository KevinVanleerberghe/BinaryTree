package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreateTreeTest {

    @Test
    void createEmptyTree() {
        Tree tree = new Tree();
        assertThat(tree).isNotNull();
        assertThat(tree.getRoot()).isNull();
        assertThat(tree.isEmpty()).isTrue();
    }


}