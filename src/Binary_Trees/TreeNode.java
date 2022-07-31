package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data=data;
    }

    public boolean insert(Queue<TreeNode> queue,int val,boolean flag) {
        if(leftChild==null) {
            leftChild=new TreeNode(val);
            return true;
        }
        else if(rightChild==null){
            rightChild=new TreeNode(val);
            return true;
        }
        else {
            queue.add(leftChild);
            queue.add(rightChild);
            return false;
        }
    }

    public boolean search(Queue<TreeNode> queue,int value,boolean flag){
        if(data==value)
            return true;
        if(leftChild!=null)
            queue.add(leftChild);
        if(rightChild!=null)
            queue.add(rightChild);
        return false;
    }

    public void get(Queue<TreeNode> queue,int value) {
        if (leftChild != null)
            queue.add(leftChild);
        if (rightChild != null)
            queue.add(rightChild);
    }

    public void getDeepestNode(Queue<TreeNode> queue){
        if(leftChild!=null)
            queue.add(leftChild);
        if(rightChild!=null)
            queue.add(rightChild);
    }

    public void deleteDeepestNode(Queue<TreeNode> queue,TreeNode prevNode){
        if(this.leftChild==null){
            prevNode.rightChild=null;
        }
        else if(this.rightChild==null){
            this.leftChild=null;
        }
        else{
            queue.add(this.leftChild);
            queue.add(this.rightChild);
        }
    }

    public void traversePreOrder(){
        System.out.print(this.data+",");
        if(this.leftChild!=null)
            this.leftChild.traversePreOrder();
        if(this.rightChild!=null)
            this.rightChild.traversePreOrder();
    }

    public void traverseInOrder(){
        if(this.leftChild!=null)
            this.leftChild.traversePreOrder();
        System.out.print(this.data+",");
        if(this.rightChild!=null)
            this.rightChild.traversePreOrder();
    }

    public void traversePostOrder(){
        if(this.leftChild!=null)
            this.leftChild.traversePreOrder();
        if(this.rightChild!=null)
            this.rightChild.traversePreOrder();
        System.out.print(this.data+",");
    }

    public void traverseLevelOrder(Queue<TreeNode> queue){
        System.out.print(this.data+",");
        if(this.leftChild!=null)
            queue.add(this.leftChild);
        if(this.rightChild!=null)
            queue.add(this.rightChild);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
