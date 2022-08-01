package Binary_Trees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Tree> treeList= new ArrayList<>();
    private static final Messages msg = new Messages();
    public static void main(String[] args) {
        msg.showAvailableOptions();
        msg.availableOptions("Tree");
        while(true){
            switch (Integer.parseInt(msg.enterMessage("your choice"))) {
                case 0 -> msg.availableOptions("Tree");
                case 1 -> createTree(msg.enterMessage("name"));
                case 2 -> deleteTree(getTree(msg.enterMessage("name")));
                case 3 -> updateTree(getTree(msg.enterMessage("name")),"updated");
                case 4 -> viewList();
                case 5 -> viewTree(getTree(msg.enterMessage("name")));
                case 6 -> System.exit(1);
                default -> msg.queryMessage("Invalid choice\n");
            }
        }
    }


    private static void createTree(String name){
        Tree binaryTree = new Tree(name);
        treeList.add(binaryTree);
        updateTree(binaryTree,"created");
    }

    private static void deleteTree(Tree binaryTree){
        if(binaryTree!=null) {
            treeList.remove(binaryTree);
            msg.successfulMessage("Tree","deleted");
        }
        else
            msg.unSuccessfulMessage("Tree");
    }

    private static Tree getTree(String name){
        for(Tree binaryTree:treeList){
            if(binaryTree.getName().equals(name)){
                return binaryTree;
            }
        }
        return null;
    }

    private static void updateTree(Tree binaryTree,String query){
        if(binaryTree!=null) {
            binaryTree.update();
            msg.successfulMessage("Tree",query);
        }
        else
            msg.unSuccessfulMessage("Tree");
    }

    private static void viewList(){
        msg.queryMessage("TreeList");
        System.out.println(treeList);
    }

    private static void viewTree(Tree binaryTree){
        if(binaryTree!=null) {
            msg.queryMessage("Level Order Traversal");
            binaryTree.traverseLevelOrder();
            msg.queryMessage("/n");
        }
        else
            msg.unSuccessfulMessage("Tree");
    }
}
