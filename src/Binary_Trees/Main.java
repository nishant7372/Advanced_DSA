package Binary_Trees;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    private static final Tree binaryTree = new Tree();
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       showAvailableOptions();
       availableOptions();
       while(true) {
           switch (scan.nextInt()) {
               case 0:
                   availableOptions();
                   break;
               case 1:
                   enterMessage();
                   boolean b = binaryTree.insert(scan.nextInt());
                   if (b)
                       successfulMessage("inserted");
                   queryMessage("Level Order Traversal");
                   binaryTree.traverseLevelOrder();
                   System.out.println();
                   break;
               case 2:
                   enterMessage();
                   b = binaryTree.delete(scan.nextInt());
                   if (b)
                       successfulMessage("deleted");
                   else
                       unSuccessfulMessage();
                   queryMessage("Level Order Traversal");
                   binaryTree.traverseLevelOrder();
                   System.out.println();
                   break;
               case 3:
                   enterMessage();
                   b = binaryTree.search(scan.nextInt());
                   if (b)
                       successfulMessage("search");
                   else
                       unSuccessfulMessage();
                   break;
               case 4:
                   queryMessage("Pre Order Traversal");
                   binaryTree.traversePreOrder();
                   System.out.println();
                   break;
               case 5:
                   queryMessage("In Order Traversal");
                   binaryTree.traverseInOrder();
                   System.out.println();
                   break;
               case 6:
                   queryMessage("Post Order Traversal");
                   binaryTree.traversePostOrder();
                   System.out.println();
                   break;
               case 7:
                   queryMessage("Level Order Traversal");
                   binaryTree.traverseLevelOrder();
                   System.out.println();
                   break;
               case 8:
                   System.exit(1);
                   break;
               default:
                   System.out.println("Invalid Choice\n");
                   enterMessage();
                   break;
           }
           showAvailableOptions();
       }
    }

    private static void availableOptions(){
        System.out.print("""
                Press -\s
                1 - Insert an Item
                2 - Delete an Item
                3 - Search an Item
                4 - PreOrder Traversal
                5 - InOrder Traversal
                6 - PostOrder Traversal
                7 - LevelOrder Traversal
                8 - exit
                Enter your Choice:\s""");
    }

    private static void enterMessage(){
        System.out.print("Enter data: ");
    }

    private static void successfulMessage(String query){
        if(query.equals("search"))
            System.out.println("Data is present");
        else
            System.out.println("Data is successfully "+query+"\n");
    }

    private static void unSuccessfulMessage(){
        System.out.println("Data is not found\n");
    }

    private static void showAvailableOptions(){
        System.out.println("------------------Press 0 - to view Available Options-------------------\n");
    }

    private static void queryMessage(String query) {
        System.out.print(query+": ");
    }
}
