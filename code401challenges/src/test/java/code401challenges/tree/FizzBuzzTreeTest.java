package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTree() {
        Tree testTree = new Tree();
        testTree.root = new Node(15,new Node(4,new Node (2),new Node(3)),new Node(10));
        FizzBuzzTree.fizzBuzzTree(testTree);

        String expected = "[FizzBuzz, 4, 2, Fizz, Buzz]";
        assertEquals(expected,testTree.preOrder().toString());
    }
    @Test
    public void fizzBuzzTree_OneItem() {
        Tree testTree = new Tree();
        testTree.root = new Node(15);
        FizzBuzzTree.fizzBuzzTree(testTree);

        String expected = "[FizzBuzz]";
        assertEquals(expected,testTree.preOrder().toString());
    }
    @Test
    public void fizzBuzzTree_EmptyTree() {
        Tree testTree = new Tree();
        FizzBuzzTree.fizzBuzzTree(testTree);
        String expected = null;
        assertEquals(expected,testTree.preOrder());
    }
    @Test
    public void fizzBuzzTree_VarifyRoot() {
        Tree testTree = new Tree();
        testTree.root = new Node(15,new Node(4,new Node (2),new Node(3)),new Node(10));
        FizzBuzzTree.fizzBuzzTree(testTree);

        String expected = "FizzBuzz";
        assertEquals(expected,testTree.root.value);
    }

}