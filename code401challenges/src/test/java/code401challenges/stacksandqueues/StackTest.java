package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(Enclosed.class)
public class StackTest {


    public static class Yo{
        Stack testStack;
        Node testNode;
        @Before
        public void setUp() throws Exception {
            testStack = new Stack();
        }
        @Test
        public void testSomething(){
            Stack stack = new Stack();
            System.out.println(stack.top);
        }
        @Test
        public void testPush(){
            testStack.push(9);
            testStack.push(7);
            testStack.push(4);
            String expected = "Top --> 4 --> 7 --> 9 --> Null";
            assertEquals(expected,testStack.toString());
        }
    }
    public static class YoYo{
        Stack testStack;
        Node testNode;
        @Before
        public void setUp() throws Exception {
            testStack = new Stack();
        }


        @Test
        public void testPop() {
            testStack.push(9);
            testStack.push(7);
            testStack.push(3);
            testStack.push(1);

            assertEquals(testStack.pop(),1);
            assertTrue(testStack.top.value.equals(3));
        }

        @Test
        public void testPeek() {
            testStack.push(9);
            testStack.push(7);
            testStack.push(3);
            testStack.push(1);

            assertEquals(testStack.peek(),1);
            assertTrue(testStack.top.value.equals(1));
        }
        @Test
        public void testIsEmpty() {
//            testStack.push(9);
//            testStack.push(7);
//            testStack.push(3);
            testStack.push(1);
            testStack.pop();
//            assertEquals(testStack.peek(),1);
            assertTrue(testStack.isEmpty());
        }
    }


}