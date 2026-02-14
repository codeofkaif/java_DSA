package Tree;

public class Insertion {

    // insertion of tree
    public static Node insertion(Node node, int value){
        if (node== null) {
            node = new Node(value);
            return node;
        }
        if(value<= node.data ){
            node.Left=insertion(node.Left, value);
        }
        if(value>node.data){
            node.right=insertion(node.right,value);
        }

        return node;

    }

}
