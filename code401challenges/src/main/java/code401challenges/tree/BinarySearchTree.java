package code401challenges.tree;

public class BinarySearchTree extends Tree<Integer>{
    Node<Integer> root = null;

    public void add(int value){
        if(this.root==null){
            this.root = new Node<>(value);
        }else{
            Node<Integer> current = this.root;
            while(current != null){
                if(value<current.value){
                    if(current.left == null){
                        current.left = new Node<>(value);
                        return;
                    }else{
                        current = current.left;
                    }
                }else{
                    if(current.right == null){
                        current.right = new Node<>(value);
                        return;
                    }else{
                        current = current.right;
                    }
                }
            }
        }
    }



//    public void add(Integer value){
//        Node<Integer> newNode = new Node<Integer>(value);
//        Node<Integer> current = this.root;
//
//        if(this.root==null){
//            root = newNode;
//        }
//        while(current!=null){
//            if((current.value>value)){
//                if((current.left==null)||(current.left.value<value)){
//                    current.left = newNode;
//                }
//            }
//        }
//    }
}
