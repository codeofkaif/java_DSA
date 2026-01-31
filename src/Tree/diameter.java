package Tree;

import javax.crypto.spec.PSource;

import static javax.swing.Spring.height;

public class diameter {
    private static Insertion.Node root;

    public static void main(String[] args) {
        Node head =null;
            int arr[] = {5,2,6,7,12,9,14,10};
            for(int item: arr){
                head = insert(head,item);

            }

            display();
            System.out.println(height(head));
        System.out.println(Diameter(head));
    }
    public static void display(){

        display( root, "root node");
    }
    private static void display(Insertion.Node node, String details){
        if(node == null) return;
        System.out.println(node.getValue());
        display(node.Left,"left child of"+node.getValue());
        display(node.right,"right child of"+node.getValue());

    }

    static Node insert(Node head, int data){
        if(head == null) return new Node(data);
        if(data<head.data)
            head.Left = insert(head.Left , data);
        if(data>head.data)
            head.right = insert(head.right , data);
        return head;
    }
    static int Diameter(Node root){
        if(root==null || root.Left==null ||root.right == null) return 0;
        int left_count = Diameter(root.Left);
        int right_count = Diameter(root.right);
        int mid = height(root.Left)+height(root.right)+2;

        int max = Math.max(left_count , Math.max(right_count, mid));
        return max;

    }

    private static int height(Node root) {
        if(root == null || (root.Left == null && root.right==null)) return 0;
        return 1+Math.max(height(root.Left),height(root.right));
    }
}
