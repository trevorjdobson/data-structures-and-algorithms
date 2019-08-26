package code401challenges.tree;

public class Node <T> {
    T value;
    Node left;
    Node right;

    Node (T val){
        this.value = val;
        this.left = null;
        this.right = null;
    }


    Node (T val, Node<T> left, Node<T> right){
        this.value = val;
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return this.value.toString();
    }
}
