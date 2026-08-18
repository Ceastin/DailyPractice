package L1;

import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR=new Color(102,51,0);
    Tree(double heightFt,double trunkDiameterInches, TreeType treeType){
        this.heightFt=heightFt;
        this.trunkDiameterInches=trunkDiameterInches;
        this.treeType=treeType;
    }
    void grow()
    {
        this.heightFt=this.heightFt+10;
        this.trunkDiameterInches=this.trunkDiameterInches+1;
    }
    void announceTallTree(){
        if(this.heightFt>30) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
        else {
            System.out.println("Not a Tall L1.Tree!");
        }
    }
}
