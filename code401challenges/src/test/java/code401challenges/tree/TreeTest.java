package code401challenges.tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;


public class TreeTest {

    @Test
    public void preOrder() {
        Tree testTree = new Tree();
        testTree.root = new Node(8,new Node(4,new Node (2),new Node(3)),new Node(10));

        String expected = "[8, 4, 2, 3, 10]";
        assertEquals(expected,testTree.preOrder().toString());
    }
    @Test
    public void preOrder_Empty(){
        Tree testTree = new Tree();

        String expected = null;
        assertEquals(expected,testTree.preOrder());
    }
    @Test
    public void inOrder(){
        Tree testTree = new Tree();
        testTree.root = new Node(8,new Node(4,new Node (2),new Node(3)),new Node(10));

        String expected = "[2, 4, 3, 8, 10]";
        assertEquals(expected,testTree.inOrder(testTree.root).toString());
    }
    @Test
    public void inOrder_Empty(){
        Tree testTree = new Tree();
        String expected = null;
        assertEquals(expected,testTree.inOrder(testTree.root));
    }

    @Test
    public void postOrder(){
        Tree testTree = new Tree();
        testTree.root = new Node(8,new Node(4,new Node (2),new Node(3)),new Node(10));

        String expected = "[2, 3, 4, 10, 8]";
        assertEquals(expected,testTree.postOrder().toString());
    }
    @Test
    public void postOrder_Empty(){
        Tree testTree = new Tree();

        String expected = null;
        assertEquals(expected,testTree.postOrder());
    }
    @Test
    public void binaryAdd(){
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(5);
        testTree.add(8);
        testTree.add(3);

        System.out.println(testTree.inOrder(testTree.root));
    }


    @Test
    public void breadthFirst(){
        Tree testTree = new Tree();
        testTree.root = new Node(2,new Node(7,new Node (2),new Node(6,new Node(5),new Node(11))),new Node(5,null,new Node(9,new Node(4),null)));
        testTree.breadthFirst();
        //Should print 2,7,5,2,6,9,5,11,4

    }
    @Test
    public void findMax(){
        Tree testTree = new Tree();
        testTree.root = new Node(2,new Node(7,new Node (2),new Node(6,new Node(5),new Node(11))),new Node(5,null,new Node(9,new Node(4),null)));

        assertEquals(11,testTree.findMax());

    }


}