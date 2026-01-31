package Tree;

public class Insertion {
    public static class Node{
        public Node Left;
        private int value;
        private  int height;
        private Node left;
        Node right;
        public Node(int value){
            this.value=value;


        }
        public int getValue(){
            return value;
        }

    }
    public Node root ;


    public int height(Node node){
        if(node==null) return -1;
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }

    // insertion of tree
    private Node insertion(Node node, int value){
        if (node== null) {
            node = new Node(value);
            return node;
        }
        if(value<= node.value ){
            node.left=insertion(node.left, value);
        }
        if(value>node.value){
            node.right=insertion(node.right,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;

    }
    public void display(){
        display( root, "root node");
    }
    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(node.getValue());
        display(node.left,"left child of"+node.getValue());
        display(node.right,"right child of"+node.getValue());

    }

}
