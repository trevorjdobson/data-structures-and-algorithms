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

        return output;
    }

    public void insertBefore(T newNodeValue, T key){
        Node current = this.head;
        Node newNode = new Node<>(newNodeValue,null);

        while(current != null){
            if(this.head.value.equals(key)){
                this.insert(newNodeValue);
                break;
            }
            if(current.next.value.equals(key)){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public  void insertAfter(T newNodeValue, T key){
        Node current = this.head;
        Node newNode = new Node<>(newNodeValue,null);
        while(current != null){
            if(current.value.equals(key)){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void append(T newNodeValue){
        Node current = this.head;
        Node newNode = new Node<>(newNodeValue,null);
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public T kFromEnd(int k) throws Exception {
        Node current = this.head;
        int size = 0;
        T output = null;
        while(current != null){
            size++;
            current = current.next;
        }
        current = this.head;
        for(int i =0;i<size-k;i++){
            output = (T) current.value;
            current = current.next;
        }
        if(output == null){
            throw new Exception("K is out of bounds");
        }
        return output;
    }

    public static LinkedList mergeLinkedLists(LinkedList listOne, LinkedList listTwo){
        LinkedList outputList = new LinkedList<>();
        Node currentListOne = listOne.head;
        Node currentListTwo = listTwo.head;

        while((currentListOne != null) || (currentListTwo != null)){
            if(currentListOne != null){
                outputList.insert(currentListOne.value);
                currentListOne = currentListOne.next;
            }
            if(currentListTwo != null){
                outputList.insert(currentListTwo.value);
                currentListTwo = currentListTwo.next;
            }

        }

        return outputList;
    }

}
