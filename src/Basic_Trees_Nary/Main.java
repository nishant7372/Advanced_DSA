package Basic_Trees_Nary;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("drinks");
        TreeNode cold = new TreeNode("cold");
        TreeNode hot = new TreeNode("hot");
        TreeNode beer = new TreeNode("beer");
        TreeNode wine = new TreeNode("wine");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode tea = new TreeNode("tea");

        drinks.addChild(cold);
        drinks.addChild(hot);
        cold.addChild(beer);
        cold.addChild(wine);
        hot.addChild(coffee);
        hot.addChild(tea);

        TreeNode BTech = new TreeNode("BTech");
        TreeNode CSE = new TreeNode("Computer Science and Engineering");
        TreeNode ECE = new TreeNode("Electronics Engineering");
        TreeNode MECH = new TreeNode("Mechanical Engineering");
        TreeNode CIVIL = new TreeNode("Civil Engineering");
        TreeNode ELECTRICAL = new TreeNode("Electrical Engineering");
        TreeNode CHEM = new TreeNode("Chemical Engineering");
        TreeNode IT = new TreeNode("Information Technology");
        TreeNode CS = new TreeNode("Computer Science");
        TreeNode AI = new TreeNode("Artificial Intelligence");
        TreeNode ML = new TreeNode("Machine Learning");

        BTech.addChild(CSE);
        BTech.addChild(ECE);
        BTech.addChild(MECH);
        BTech.addChild(ELECTRICAL);
        BTech.addChild(CIVIL);
        BTech.addChild(CHEM);
        CSE.addChild(CS);
        CSE.addChild(IT);
        CS.addChild(AI);
        CS.addChild(ML);

        System.out.println(drinks.print(0)+"\n");
        System.out.println(BTech.print(0));
    }
}
