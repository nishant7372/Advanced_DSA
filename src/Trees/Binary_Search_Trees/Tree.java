package Trees.Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private TreeNode root;

    public boolean insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return true;
        } else
            return root.insert(value);
    }

    public void traverseInOrder() {
        if(root!=null)
            root.traverseInOrder();
    }

    public void traversePreOrder() {
        if(root!=null)
            root.traversePreOrder();
    }

    public void traversePostOrder() {
        if(root!=null)
            root.traversePostOrder();
    }

    public void traverseLevelOrder() {
        if(root!=null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode presentNode = queue.remove();
                presentNode.traverseLevelOrder(queue);
            }
        }
    }

    public TreeNode get(int value) {
        if(root==null)
            return null;
        else{
            return root.get(value);
        }
    }

    public TreeNode min() {
        if(root==null)
        return null;
        else {
            return root.min();
        }
    }

    public TreeNode max() {
        if(root==null)
            return null;
        else {
            return root.max();
        }
    }

    public void deleteNode(int key){
        if(root!=null)
            root = root.deleteNode(key);
    }
}
