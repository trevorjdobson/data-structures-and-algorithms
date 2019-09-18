package code401challenges.utilities;

import code401challenges.hashtable.HashNode;
import code401challenges.hashtable.Hashtable;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;

public class LeftJoin {
    public ArrayList leftJoin(Hashtable table1,Hashtable table2){
        ArrayList output = new ArrayList();
        for(int i = 0;i<table1.map.length;i++){
            System.out.println(table1.map[i].getKey());
            Tree tree = new Tree();
            tree.root = new Node(table1.map[i].getKey(),new Node(table1.map[i].getValue()),null);
            if(table2.contains(table1.map[i].getKey())){
                tree.root.right = new Node(table2.get(table1.map[i].getKey()));
            }
            output.add(tree);
        }
        return output;
    }
}
