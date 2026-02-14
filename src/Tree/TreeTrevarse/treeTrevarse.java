package Tree.TreeTrevarse;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class treeTrevarse {
    // Preorder
    static void preorder(Node root){
        if(root == null ) return;
        System.out.print(root.data+"->");
        preorder(root.Left);
        preorder(root.right);
    }
    // Inorder
    static void inorder(Node root){
        if(root == null ) return;
        inorder(root.Left);
        System.out.print(root.data+"->");
        inorder(root.right);

    }
    // Postorder
    static void postorder(Node root){
        if(root == null ) return;
        postorder(root.Left);
        postorder(root.right);
        System.out.print(root.data+"->");
    }


   public static Node insert(Node root , int value){
       if (root == null) {
           return new Node(value);
       }
       if(value > root.data){
           root.right = insert(root.right , value);

       }
       if(value<root.data) {
           root.Left = insert(root.Left , value);
       }
       return root;


   }

   // Level Traversal
//   static void levelOrder(Node root , int n){
//        if(root == null) return;
//        if(n==0) {
//            System.out.print(root.data + "->");
//            return;
//        }
//        levelOrder(root.Left, n-1);
//        levelOrder(root.right, n-1);
   //}
   // level order traversal (BFS)
    static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            if (temp.Left != null) q.add(temp.Left);
            if(temp.right!=null ) q.add(temp.right);
            System.out.print(temp.data+"->");
            q.remove();

        }
    }
   // height of the tree
   static int Height(Node root){
        if (root == null || (root.Left == null && root.right == null)) return 1;
        return 1+ Math.max(Height(root.Left) , Height(root.right));
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

        System.out.println("preorder ");
        preorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);
        System.out.println("sum of all element of Tree"+ sum(root));
        System.out.println("level order");
        bfs(root);
        System.out.println();
        System.out.println("recursive level order ");

        int height =Height(root);
        System.out.println(height);
//        for(int i = 0 ; i< height; i++){
//            levelOrder(root , i);
//
//        }

    }

}
