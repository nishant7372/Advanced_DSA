package Binary_Search_Trees;

public class Main {

    public static void main(String[] args)
    {
        Tree intTree = new Tree();
        System.out.println(intTree.insert(20));
        intTree.insert(25);
        intTree.insert(2);
        intTree.insert(16);
        intTree.insert(10);
        intTree.insert(24);
        intTree.insert(40);
        intTree.insert(22);

        intTree.traversePreOrder();
        System.out.println();
        intTree.traverseInOrder();
        System.out.println();
        intTree.traversePostOrder();
        System.out.println();

        System.out.println(intTree.get(16));
        System.out.println(intTree.get(40));
        System.out.println(intTree.get(26));
        System.out.println(intTree.min());
        System.out.println(intTree.max());

    }
}
