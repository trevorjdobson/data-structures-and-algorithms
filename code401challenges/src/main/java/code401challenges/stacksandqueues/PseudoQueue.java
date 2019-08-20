package code401challenges.stacksandqueues;

public class PseudoQueue <T>{
    Stack<T> enqueueStack = new Stack();
    Stack<T> dequeueStack = new Stack();

    public void enqueue(T value){

        while(!dequeueStack.isEmpty()){
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);
    }
    public T dequeue(){
        while(!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
        T output = dequeueStack.pop();
        return output;
    }

    public String toString(){
        String output = "";
        if(!enqueueStack.isEmpty()){
            output += "EnqueStack: " + enqueueStack.toString();
        }else{
            output += "EnqueStack is currently Empty";
        }
        if(!dequeueStack.isEmpty()){
            output+= "\nDequeStack: " + dequeueStack.toString();
        }else {
            output += "\nDequeStack is currently Empty";
        }
        return output;
    }
}
