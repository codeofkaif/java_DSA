package Tree;

public class treeTrevarse {

    static void preorderTraverse(Node tempNode){
        if(tempNode == null) return;
        System.out.print(tempNode.data+"-->");
        preorderTraverse(tempNode.Left);
        preorderTraverse(tempNode.right);
    }
    static Node insert(Node node , int value){
        if(node == null) {
            return new Node(value);
        }
        if(node.data>value){
            node.Left = insert(node.Left , value);
        }
        if(node.data<value){
            node.right = insert(node.right  , value);
        }
        return node;
        
    }
    // sum of tree
    static int sum(Node root){
        if(root==null) return 0;
        return root.data + sum(root.Left) + sum(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int arr[] = {21,23,12,43,54,65,12,1,3,4,5,6,7,8,9,2,3,4,6,7,22};
        for(int item : arr){
            root = insert(root,item);
            
        }
        preorderTraverse(root);
        System.out.println();
        System.out.println("sum of all element of Tree"+ sum(root));

    }

}
