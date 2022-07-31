package Binary_Trees;

public class Main {
    public static void main(String[] args) {
        Tree binaryTree = new Tree();
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(7);
        binaryTree.insert(8);
        binaryTree.insert(9);
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(13);
        binaryTree.insert(14);
        binaryTree.insert(15);
        System.out.print("PreOrder : ");
        binaryTree.traversePreOrder();
        System.out.print("\nInOrder : ");
        binaryTree.traverseInOrder();
        System.out.print("\nPostOrder : ");
        binaryTree.traversePostOrder();
        System.out.print("\nLevelOrder : ");
        binaryTree.traverseLevelOrder();
        System.out.println();
        System.out.println(binaryTree.search(10));
        System.out.println(binaryTree.search(6));
        System.out.println(binaryTree.search(100));

        System.out.println(binaryTree.delete(2));
        binaryTree.traverseLevelOrder();
        System.out.println(binaryTree.delete(10));
        binaryTree.traverseLevelOrder();
        System.out.println(binaryTree.delete(20));
        binaryTree.traverseLevelOrder();
        System.out.println(binaryTree.delete(100));
        binaryTree.traverseLevelOrder();


    }
}
