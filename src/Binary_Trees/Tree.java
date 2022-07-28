package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private TreeNode root;

    public void insert(int val) {
        if(root==null)
            root=new TreeNode(val);
        else {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode presentNode = queue.remove();
                boolean flag = presentNode.insert(queue,val,false);
                if(flag)
                    break;
            }
        }
    }

    public boolean search(int value){
        if(root!=null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode presentNode = queue.remove();
                boolean flag = presentNode.search(queue,value,false);
                if(flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public TreeNode get(int value){
        if(root==null)
            return null;
        else
            return root.get(value);
    }

    public void traversePreOrder() {
        if(root!=null)
            root.traversePreOrder();
    }

    public void traverseInOrder() {
        if(root!=null)
            root.traverseInOrder();
    }

    public void traversePostOrder() {
        if(root!=null)
            root.traversePostOrder();
    }

    public void traverseLevelOrder() {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null)
            queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode presentNode = queue.remove();
            presentNode.traverseLevelOrder(queue);
        }
    }
}
