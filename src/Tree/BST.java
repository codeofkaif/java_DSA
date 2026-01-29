package Tree;

public class BST {
    public static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;

        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BST(){

    }
    public void Display(){
        Display(root,"root node");
    }
    private void Display(Node node , String details){
        if(node == null) return;
        System.out.println(details + node.getValue());
        Display(node.left,"left child of "+ node.getValue()+" : ");
        Display(node.right,"right child of "+ node.getValue()+" : ");
    }


}
    