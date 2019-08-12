package code401challenges.LinkedLists;

public class Node <T> {
    T value;
    Node next;

    Node (T val, Node<T> next){
        this.value = val;
        this.next = next;
    }
}
