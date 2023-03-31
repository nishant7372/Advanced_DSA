package Fenwick_Trees;

public class Fenwick_Tree {
    int[] tree;
    public Fenwick_Tree(int[] nums){
        this.tree = new int[nums.length];
        construct(nums);
    }

    private void construct(int[] nums){
        for(int index=1;index<=nums.length;index++){
            update(index,nums[index-1]);
        }
    }

    private void update(int index,int num){
        while(index<this.tree.length){
            this.tree[index]+= num;
            index = next(index);
        }
    }


    private int sum(int index){
        index++;
        int sum =0 ;
        while(index>0){
            sum+=this.tree[index];
            index = parent(index);
        }
        return sum;
    }

    private int next(int index){
        return index+(index&(-index));
    }

    private int parent(int index){
        return index-(index&(-index));
    }

    public int rangeSum(int startIndex,int endIndex){
        return sum(endIndex) - sum(startIndex-1);
    }
}
