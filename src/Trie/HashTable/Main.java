package Trie.HashTable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Trie trie = new Trie();
        boolean flag = true;
        while(flag) {
            System.out.println("""
                     1. Insert
                     2. Search String
                     3. Search Prefix
                     4. Exit\
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> insert(trie);
                case 2 -> search(trie);
                case 3 -> searchPrefix(trie);
                case 4 -> flag=false;
            }
        }
    }

    private static void insert(Trie trie){
        System.out.println("Enter String: ");
        String s = scan.next()+scan.nextLine();
        trie.insert(s);
    }

    private static void search(Trie trie){
        System.out.println("Enter String: ");
        String s = scan.next()+scan.nextLine();
        boolean res = trie.search(s);
        if(res){
            System.out.println(s+" is present in the trie");
        }
        else{
            System.out.println(s+" is not present in the trie");
        }
    }

    private static void searchPrefix(Trie trie){
        System.out.println("Enter prefix String: ");
        String s = scan.next()+scan.nextLine();
        ArrayList<String> list = new ArrayList<>();
        trie.searchPrefix(s,list);
        System.out.println("Search Results:" + list);
    }
}
