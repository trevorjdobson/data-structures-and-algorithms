package code401challenges.treeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class TreeIntersection {
    public static ArrayList<Integer> findCommonNodeValues(Tree<Integer> treeOne, Tree<Integer> treeTwo){
        ArrayList<Integer> output = new ArrayList<>();
        if(treeOne.root==null){
            return output;
        }else{
            Stack<Node> stack = new Stack<>();
            stack.push(treeOne.root);
            while(!stack.empty()) {
                Node current = stack.pop();
                Stack<Node> stack2 = new Stack<>();
                stack2.push(treeTwo.root);
                while(!stack2.empty()){
                    Node current2 = stack2.pop();
                    if(current.value == current2.value){
                        output.add((int)current.value);
                    }

                    if (current2.right != null) {
                        stack2.push(current2.right);
                    }
                    if (current2.left != null) {
                        stack2.push(current2.left);
                    }

                }

                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }


        return output;
    }
}
