package code401challenges.stacksandqueues;

public class Stack <T>{
    Node<T> top = null;

    public void push(T value){
        Node newNode = new Node<T>(value,this.top);
        this.top = newNode;
    }

    public T pop(){
        T output = this.top.value;
        this.top = this.top.next;
        return output;
    }

    public T peek(){
        return this.top.value;
    }

    public String toString() {
        String output = "Top --> " + this.top.toString();
        Node current = this.top.next;
        while (current != null) {
            output += " --> " + current.value.toString();
            current = current.next;
        }
        output += " --> Null";
        return output;
    }
    public boolean isEmpty(){
        if(this.top!=null){
            return false;
        }else{
            return true;
        }
    }
}
