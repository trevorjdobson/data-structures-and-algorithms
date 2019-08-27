package code401challenges.tree;

import java.util.Stack;

public class FizzBuzzTree {
    public static Tree<Object> fizzBuzzTree(Tree<Object> inputTree) {
        if(inputTree.root==null){
            return inputTree;
        }else{
            Stack<Node> stack = new Stack<>();
            stack.push(inputTree.root);

            while(!stack.empty()){
                Node current = stack.pop();
                if(((int)current.value%3==0)&&((int)current.value%5==0)){
                    current.value = "FizzBuzz";
                }else if((int)current.value%3==0){
                    current.value = "Fizz";
                }else if((int)current.value%5==0){
                    current.value = "Buzz";
                }

                if(current.right != null){
                    stack.push(current.right);
                }
                if(current.left != null){
                    stack.push(current.left);
                }
            }
            return inputTree;
        }
    }
}
