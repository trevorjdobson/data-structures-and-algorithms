package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testQueue(){
        Queue newQueue = new Queue();
        newQueue.enqueue(9);
        newQueue.enqueue(8);
        newQueue.enqueue(7);

        String expected = "Front --> 9 --> 8 --> 7 <-- Back";
        assertEquals(expected,newQueue.toString());
    }
    @Test
    public void testQueue_Empty(){
        Queue newQueue = new Queue();
        String expected = "Queue is Empty";
        assertEquals(expected,newQueue.toString());
    }
    @Test
    public void testQueue_OneItem(){
        Queue newQueue = new Queue();
        newQueue.enqueue(5);

        assertEquals(newQueue.back.value,5);
        assertEquals(newQueue.front.value,5);
    }

    @Test
    public void testDequeue(){
        Queue newQueue = new Queue();
        newQueue.enqueue(5);
        newQueue.enqueue(6);
        newQueue.enqueue(7);
        newQueue.enqueue(8);

        assertEquals(newQueue.dequeue(),5);
        assertEquals(newQueue.toString(),"Front --> 6 --> 7 --> 8 <-- Back");
    }
    @Test
    public void testDequeue_OneItem(){
        Queue newQueue = new Queue();
        newQueue.enqueue(5);

        assertEquals(newQueue.dequeue(),5);
        assertEquals(newQueue.toString(),"Queue is Empty");
    }

    @Test
    public void testPeek(){
        Queue newQueue = new Queue();
        newQueue.enqueue(5);
        newQueue.enqueue(6);
        newQueue.enqueue(7);
        newQueue.enqueue(8);

        assertEquals(newQueue.peek(),5);
        assertEquals(newQueue.front.value, 5);
    }

}