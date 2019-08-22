package code401challenges.utilities;

import code401challenges.stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack<Character> stack = new Stack();

        if(input.equals("")){return true;}
        if((input.charAt(input.length()-1)=='{') || (input.charAt(input.length()-1)=='(') || (input.charAt(input.length()-1)=='[')){
            return false;
        }

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if( (c=='(') || (c=='{') || (c=='[') ){
                stack.push(c);
            }
            if(c==')'){
                char temp = stack.pop();
                if(temp!='('){
                    return false;
                }
            }
            if(c=='}'){
                char temp = stack.pop();
                if(temp!='{'){
                    return false;
                }
            }
            if(c==']'){
                char temp = stack.pop();
                if(temp!='['){
                    return false;
                }
            }

        }

        return true;
    }
}
