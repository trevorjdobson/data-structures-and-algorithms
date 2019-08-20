package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue testPseudoQueue;
    @Before
    public void setUp() throws Exception {
        testPseudoQueue = new PseudoQueue();

        testPseudoQueue.enqueue(1);
        testPseudoQueue.enqueue(2);
        testPseudoQueue.enqueue(3);
    }

    @Test
    public void enqueue() {
        String expected = "EnqueStack: Top --> 3 --> 2 --> 1 --> Null\n" +
                "DequeStack is currently Empty";
        assertEquals(expected,testPseudoQueue.toString());
    }

    @Test
    public void testDequeue() {
        String expected = "EnqueStack is currently Empty\n" +
                "DequeStack: Top --> 2 --> 3 --> Null";

        assertEquals(1,testPseudoQueue.dequeue());
        assertEquals(expected,testPseudoQueue.toString());

    }
    @Test
    public void testEvertything() {
        String expected = "EnqueStack: Top --> 13 --> 33 --> 16 --> 3 --> Null\n" +
                "DequeStack is currently Empty";

        testPseudoQueue.enqueue(16);
        testPseudoQueue.enqueue(33);
        testPseudoQueue.dequeue();
        testPseudoQueue.dequeue();
        testPseudoQueue.enqueue(13);
        assertEquals(expected,testPseudoQueue.toString());

    }
}