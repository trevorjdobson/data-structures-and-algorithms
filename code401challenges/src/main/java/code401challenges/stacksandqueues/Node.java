package code401challenges.stacksandqueues;

public class Node <T> {
    T value;
    Node next;

    Node (T val, Node<T> next){
        this.value = val;
        this.next = next;
    }

    public String toString(){
        return this.value.toString();
    }
}
