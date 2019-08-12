package code401challenges.LinkedLists;

public class LinkedList <T> {
    Node<T> head = null;

    public void insert(T val){
        Node newNode = new Node<>(val,this.head);
        head = newNode;

    }
    public boolean includes(T val){
        Node current = this.head;
        while(current != null){
            if(current.value == val){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString(){
        String output = "";

        Node current = this.head;
        while(current != null){
            output = output + current.value.toString() + ",";
            current = current.next;
        }
        output = output.substring(0, output.length() - 1);
        System.out.println(output);
        return output;
    }

}
