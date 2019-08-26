package code401challenges.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree <T>{

    Node<T> root = null;


    public ArrayList<T> preOrder(){
        ArrayList<T> output = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(this.root);
        if(this.root==null){
            return null;
        }
        while(!stack.empty()){
            Node current = stack.pop();
            output.add((T) current.value);
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
        return output;
    }

    public List<T> inOrder(){
        ArrayList<T> output = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if(this.root==null){
            return null;
        }
        Node current = this.root;
        while((current != null) || (!stack.empty())){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            output.add((T)current.value);
            current = current.right;
        }
        return output;
    }

    public List<T> postOrder(){
        ArrayList<T> output = new ArrayList<>();
        if(this.root==null){
            return null;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(this.root);
        while(!stack.empty()){
            Node current = stack.pop();
            output.add(0,(T)current.value);
            if(current.left != null){
                stack.push(current.left);
            }
            if(current.right != null){
                stack.push(current.right);
            }
        }
        return output;
    }





}
