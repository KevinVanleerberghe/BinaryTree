package be.vives.ti;

public class App {

  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.insert(22);
    tree.insert(10);
    tree.insert(25);
    tree.insert(24);
    tree.insert(4);
    tree.insert(30);
    tree.insert(12);
    System.out.println(tree.min());
    System.out.println(tree.max());
    System.out.println(tree.traversalPreOrder());
    System.out.println(tree.traversalLevelOrder());
    System.out.println(tree.search(24).getData());

    tree.traversalInOrder();
  }
}