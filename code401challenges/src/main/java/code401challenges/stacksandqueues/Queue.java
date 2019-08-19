package code401challenges.stacksandqueues;

public class Queue <T> {
    Node<T> front = null;
    Node<T> back = null;

    public void enqueue(T value){
        Node newNode = new Node<T>(value,null);
        if(this.front == null){
            this.front = newNode;
        }
        if(this.back != null){
            this.back.next = newNode;
        }
        this.back = newNode;
    }

    public T dequeue(){
        T output = this.front.value;
        this.front = this.front.next;
        return output;
    }

    public T peek(){
        return this.front.value;
    }

    public String toString() {
        String output = "";
        if(this.front != null){
            output += "Front --> " + this.front.toString();
            Node current = this.front.next;
            while (current != null) {
                output += " --> " + current.value.toString();
                current = current.next;
            }
            output += " <-- Back";
        }else{
            output += "Queue is Empty";
        }

        return output;
    }
}
