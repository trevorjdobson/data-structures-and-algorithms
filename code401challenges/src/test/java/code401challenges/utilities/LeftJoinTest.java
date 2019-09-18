package code401challenges.utilities;

import code401challenges.hashtable.HashNode;
import code401challenges.hashtable.Hashtable;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LeftJoinTest {
    Hashtable testHashTable1;
    Hashtable testHashTable2;

    @Before
    public void setUp(){
        testHashTable1 = new Hashtable(1024);
        testHashTable1.add("test","synonim");
        testHashTable1.add("yo","synonim");
        testHashTable1.add("me","synonim");

        testHashTable2 = new Hashtable(1024);
        testHashTable2.add("test","this");
        testHashTable2.add("nope","this is lab 2");
        testHashTable2.add("me","this is lab 3");
    }
    @Test
    public void leftJoinTest() {
        LeftJoin leftJoin = new LeftJoin();
        ArrayList test = leftJoin.leftJoin(testHashTable1,testHashTable2);
        for(int i = 0;i<test.size();i++){
            System.out.println(test.get(i).toString());
        }
    }
}