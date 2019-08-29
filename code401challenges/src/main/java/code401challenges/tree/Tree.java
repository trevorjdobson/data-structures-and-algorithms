package code401challenges.tree;

import java.util.*;

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
    public ArrayList<T> preOrderAgain(Node<T> current){

        if(current == null){
            return new ArrayList<>();
        }else{
            ArrayList<T> left = preOrderAgain(current.left);
            ArrayList<T> right = preOrderAgain(current.right);

            ArrayList<T> ans = new ArrayList<>();
            ans.add(current.value);
            ans.addAll(left);
            ans.addAll(right);
            return ans;
        }
    }

    public List<T> inOrder(Node<T> root){
        ArrayList<T> output = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if(root==null){
            return null;
        }
        Node current = root;
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
    public ArrayList<T> inOrderAgain(Node<T> current){

        if(current == null){
            return new ArrayList<>();
        }else{
            ArrayList<T> left = inOrderAgain(current.left);
            ArrayList<T> right = inOrderAgain(current.right);

            ArrayList<T> ans = new ArrayList<>();
            ans.addAll(left);
            ans.add(current.value);
            ans.addAll(right);
            return ans;
        }
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



    public ArrayList<T> postOrderAgain(Node<T> current){

        if(current == null){
            return new ArrayList<>();
        }else{
            ArrayList<T> left = postOrderAgain(current.left);
            ArrayList<T> right = postOrderAgain(current.right);

            ArrayList<T> ans = new ArrayList<>();
            ans.addAll(left);
            ans.addAll(right);
            ans.add(current.value);
            return ans;
        }
    }
    public void breadthFirst(){
        Queue<Node> queue = new LinkedList();
        if(this.root==null){System.out.println("The Tree Is Empty, You Should Plant Something");}
        else{
            queue.add(this.root);
            while(!queue.isEmpty()){
                Node current = queue.remove();
                System.out.println(current.value.toString());
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
            }
        }
    }

    public int findMax(){
            int largest = (int)this.root.value;
            Queue<Node> queue = new LinkedList();
            queue.add(this.root);
            while(!queue.isEmpty()){
                Node current = queue.remove();
                if((int)current.value>largest){
                    largest = (int)current.value;
                }
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}

            }
            return largest;
    }




}
