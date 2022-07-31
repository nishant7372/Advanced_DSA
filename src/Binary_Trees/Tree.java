package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private TreeNode root;

    public boolean insert(int val) {
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
        return true;
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

    private TreeNode get(int value) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode presentNode = queue.remove();
                if (presentNode.getData() == value)
                    return presentNode;
                else
                    presentNode.get(queue, value);
            }
        }
        return null;
    }

    private TreeNode getDeepestNode(){
        if(root!=null)
        {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            TreeNode presentNode = null;
            while(!queue.isEmpty())
            {
                presentNode = queue.remove();
                presentNode.getDeepestNode(queue);
            }
            return presentNode;
        }
        return null;
    }

    private void deleteDeepestNode(){
        if(root!=null) {
            Queue<TreeNode> queue = new LinkedList<>();
            TreeNode prevNode, presentNode = null;
            queue.add(root);
            while (!queue.isEmpty()) {
                prevNode = presentNode;
                presentNode = queue.remove();
                presentNode.deleteDeepestNode(queue, prevNode);
            }
        }
    }

    public boolean delete(int value){
        TreeNode temp = get(value);
        if(temp!=null) {
            if(getDeepestNode()!=null)
                temp.setData(getDeepestNode().getData());
            deleteDeepestNode();
            return true;
        }
        return false;
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
