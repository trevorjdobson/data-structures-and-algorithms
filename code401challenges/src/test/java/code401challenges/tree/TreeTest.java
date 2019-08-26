package code401challenges.tree;

import org.junit.Test;

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
        assertEquals(expected,testTree.inOrder().toString());
    }
    @Test
    public void inOrder_Empty(){
        Tree testTree = new Tree();
        String expected = null;
        assertEquals(expected,testTree.inOrder());
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
}