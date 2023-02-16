package Trees.Binary_Trees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Messages {
    private static final Scanner scan = new Scanner(System.in);
    public String enterMessage(String query){
        System.out.print("Enter "+query+": ");
        if(query.equals("name")) {
            return scan.nextLine();
        }
        else {
            try {
                int choice = scan.nextInt();
                scan.nextLine();
                return choice+"";
            }
            catch (InputMismatchException e){
                System.out.println("Input Mismatch Exception...");
                scan.nextLine();
            }
            return enterMessage(query);
        }
    }

    public void successfulMessage(String query1,String query2){
        if(query2.equals("search"))
            System.out.println(query1+" is present");
        else
            System.out.println(query1+" is successfully "+query2+"\n");
    }

    public void unSuccessfulMessage(String query){
        System.out.println(query+" is not found\n");
    }

    public void showAvailableOptions(){
        System.out.println("------------------Press 0 - to view Available Options-------------------\n");
    }

    public void availableOptions(String query) {
        if (query.equals("Tree")) {
            System.out.print("""
                    Press -\s
                    1 - Create a New Tree
                    2 - Delete an Existing Tree
                    3 - Update an Existing Tree
                    4 - View Tree List
                    5 - View an Existing Tree
                    6 - Save it...\s
                    """);
        }
        if(query.equals("Data")){
            System.out.print("""
                Press -\s
                1 - Insert a New Item
                2 - Delete an Existing Item
                3 - Search an Existing Item
                4 - PreOrder Traversal
                5 - InOrder Traversal
                6 - PostOrder Traversal
                7 - LevelOrder Traversal
                8 - Exit...\s
                """);
        }
    }
    public void queryMessage(String query) {
        if(query.equals("\n"))
            System.out.println();
        else if(query.endsWith("\n")){
            query = query.substring(0,query.length()-1);
            if(query.endsWith("...")){
                System.out.println(query);
            }
            else{
                System.out.println(query + ":");
            }
        }
        else
            System.out.print(query+": ");
    }
}
