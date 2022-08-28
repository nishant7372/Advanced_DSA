package Binary_Search_Trees;

public class Main {

    public static void main(String[] args)
    {
        Tree intTree = new Tree();
        System.out.println(intTree.insert(20));
        System.out.println(intTree.insert(25));
        System.out.println(intTree.insert(2));
        System.out.println(intTree.insert(16));
        System.out.println(intTree.insert(10));
        System.out.println(intTree.insert(24));
        System.out.println(intTree.insert(40));
        System.out.println(intTree.insert(22));
        System.out.println(intTree.insert(25));
        System.out.println(intTree.insert(43));
        System.out.println(intTree.insert(35));

        intTree.traversePreOrder();
        System.out.println();
        intTree.traverseInOrder();
        System.out.println();
        intTree.traversePostOrder();
        System.out.println();
        intTree.traverseLevelOrder();
        System.out.println();

        System.out.println(intTree.get(16));
        System.out.println(intTree.get(40));
        System.out.println(intTree.get(26));
        System.out.println(intTree.min());
        System.out.println(intTree.max());
        intTree.deleteNode(10);
        System.out.println("10 deleted");
        intTree.traverseLevelOrder();
        System.out.println();
        intTree.deleteNode(24);
        System.out.println("24 deleted");
        intTree.traverseLevelOrder();
        System.out.println();
        intTree.deleteNode(43);
        System.out.println("43 deleted");
        intTree.traverseLevelOrder();
        System.out.println();
        intTree.deleteNode(35);
        System.out.println("35 deleted");
        intTree.traverseLevelOrder();
        System.out.println();
        intTree.deleteNode(2343);
        System.out.println("2343 deleted");
        intTree.traverseLevelOrder();
        System.out.println();
        intTree.deleteNode(324);
        System.out.println("324 deleted");
        intTree.traverseLevelOrder();
        System.out.println();

    }
}
