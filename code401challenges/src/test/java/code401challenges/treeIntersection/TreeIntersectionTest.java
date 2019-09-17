package code401challenges.treeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void findCommonNodeValues_OneMatch() {
        Tree testTree = new Tree();
        testTree.root = new Node(2,new Node(74,new Node (29),new Node(68,new Node(55),new Node(110))),new Node(50,null,new Node(90,new Node(40),null)));
        Tree testTree2 = new Tree();
        testTree2.root = new Node(2,new Node(7,new Node (22),new Node(6,new Node(5),new Node(11))),new Node(57,null,new Node(9,new Node(4),null)));

        assertEquals("[2]",TreeIntersection.findCommonNodeValues(testTree,testTree2).toString());

    }
    @Test
    public void findCommonNodeValues_Multiple() {
        Tree testTree = new Tree();
        testTree.root = new Node(2,new Node(74,new Node (29),new Node(68,new Node(55),new Node(110))),new Node(50,null,new Node(90,new Node(40),null)));
        Tree testTree2 = new Tree();
        testTree2.root = new Node(2,new Node(74,new Node (29),new Node(6,new Node(5),new Node(11))),new Node(5,null,new Node(9,new Node(4),null)));
        assertEquals("[2, 74, 29]",TreeIntersection.findCommonNodeValues(testTree,testTree2).toString());
    }
}