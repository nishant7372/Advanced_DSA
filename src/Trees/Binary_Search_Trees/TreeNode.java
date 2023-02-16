package Trees.Binary_Search_Trees;

import java.util.Queue;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode (int data) {
        this.data = data;
    }

    public boolean insert(int value) {
        if (value == data) {
            return false;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
                return true;
            } else {
                return leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
                return true;
            } else {
                return rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(data + ", ");
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePostOrder();
        }
        if (rightChild != null) {
            rightChild.traversePostOrder();
        }
        System.out.print(data + ", ");
    }

    public void traverseLevelOrder(Queue<TreeNode> queue) {
        System.out.print(data + ", ");
        if(this.leftChild!=null)
            queue.add(this.leftChild);
        if(this.rightChild!=null)
            queue.add(this.rightChild);
    }

    public TreeNode get(int value) {
        if (data == value)
            return this;
        if (data > value) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public TreeNode min() {
        if (leftChild == null)
            return this;
        else
            return leftChild.min();
    }

    public TreeNode max() {
       if (rightChild == null)
           return this;
       else
           return rightChild.max();
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

    public TreeNode deleteNode(int key){
        if(key<data){
            if(leftChild!=null)
                leftChild = leftChild.deleteNode(key);
        }
        else if(key>data){
            if(rightChild!=null)
                rightChild = rightChild.deleteNode(key);
        }
        else{
            if(leftChild!=null&&rightChild!=null){
                TreeNode minNode = rightChild.min();
                data = minNode.data;
                rightChild = rightChild.deleteNode(minNode.data);
            }
            else if(leftChild!=null)
                return leftChild;
            else if(rightChild!=null)
                return rightChild;
            else
                return null;
        }
        return this;
    }
    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
