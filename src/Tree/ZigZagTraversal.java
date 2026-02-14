package Tree;

import static Tree.Insertion.insertion;
import static Tree.maxValueInTree.height;

public class ZigZagTraversal {
    static void levelOrder(Node head , int n){
        if(head == null ) return ;
        if(n==1){
            System.out.print(" "+head.data);
            return;
        }
        levelOrder(head.Left , n-1);
        levelOrder(head.right , n-1);
    }

    public static void levelOrder2(Node root , int n){
        if(root == null ) return;
        if(n == 1) {
            System.out.print(root.data + " ");
            return;
        }
        levelOrder2(root.right , n-1);
        levelOrder2(root.Left , n-1);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int item : arr){
            root = insertion(root , item);
        }
        int level = height(root)+1;
        for(int i = 1; i<=level;i++){
            if(i%2!=0)
           levelOrder(root,i);
            else {
                levelOrder2(root, i);
            }
            System.out.println();
        }
    }
}
