package Basic_Trees_Nary;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private final String data;
    private final List<TreeNode> childList;

    public TreeNode(String data) {
        this.data = data;
        this.childList= new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        this.childList.add(node);
    }

    public String print(int level)
    {
        String ret="--".repeat(level)+""+this.data+"\n";
        for(TreeNode node:this.childList) {
            ret+=node.print(level + 1);
        }
        return ret;
    }

}
