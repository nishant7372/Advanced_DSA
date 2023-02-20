package Trie.HashTable;

import java.util.ArrayList;

public class Trie {
    Trie[] table;
    boolean stop;
    public Trie(){
        this.table=new Trie[128];
        this.stop=false;
    }

    public void insert(String s){
        Trie temp = this;
        for(char ch:s.toCharArray()){
            if(temp.table[ch]==null) {
                temp.table[ch] = new Trie();
            }
            temp=temp.table[ch];
        }
        temp.stop=true;
    }

    public boolean search(String s){
        Trie temp = this;
        for(char ch:s.toCharArray()){
            if(temp.table[ch]!=null) {
                temp=temp.table[ch];
            }
            else
                return false;
        }
        return temp.stop;
    }

    public boolean searchPrefix(String s, ArrayList<String> list){
        Trie temp = this;
        for(char ch:s.toCharArray()){
            if(temp.table[ch]!=null)
                temp=temp.table[ch];
            else
                return false;
        }
        findResults(temp,s,list);
        return true;
    }

    private void findResults(Trie trie, String temp, ArrayList<String> list){
        if(trie.stop){
            list.add(temp);
        }
        for(int i=0;i<128;i++) {
            if(trie.table[i]!=null) {
                findResults(trie.table[i], temp+(char)(i), list);
            }
        }
    }
}
