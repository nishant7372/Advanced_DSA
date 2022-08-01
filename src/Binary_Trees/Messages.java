package Binary_Trees;

import java.util.Scanner;

public class Messages {
    private static final Scanner scan = new Scanner(System.in);
    public String enterMessage(String query){
        System.out.print("Enter "+query+": ");
        if(query.equals("name")) {
            scan.nextLine();
            return scan.nextLine();
        }
        else{
            int choice = scan.nextInt();
            return choice+"";
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
                8 - Exit...
                Enter your Choice:\s""");
        }
    }
    public void queryMessage(String query) {
        System.out.print(query+": ");
    }
}
