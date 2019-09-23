package code401challenges.utilities;

import code401challenges.hashtable.HashNode;
import code401challenges.hashtable.Hashtable;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeftJoin {
    public ArrayList leftJoin(Hashtable table1,Hashtable table2){
        ArrayList output = new ArrayList();
        for(int i = 0;i<table1.map.length;i++){

            if(table1.map[i] != null){
                String[] arr = new String[3];
                arr[0] = table1.map[i].getKey();
                arr[1] = table1.map[i].getValue();
                if(table2.contains(table1.map[i].getKey())){
                    arr[2] = table2.get(table1.map[i].getKey());
                }
                output.add(arr);
            }

        }
        return output;
    }
}
