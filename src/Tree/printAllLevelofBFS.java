package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class printAllLevelofBFS {
    static int height(Node temp){
        if(temp == null ||(temp.Left==null && temp.right == null)) return 0;
        return 1+height(temp.Left)+height(temp.right);
    }
    static Node insert(Node head, int data){
        if(head == null) return new Node(data);
        if(data<head.data)
            head.Left = insert(head.Left , data);
        if(data>head.data)
            head.right = insert(head.right , data);
        return head;
    }
//    static void printLevel(Node head , int n){
//        if(head == null ) return ;
//        if(n==1) System.out.print(" "+head.data);
//        printLevel(head.Left , n-1);
//        printLevel(head.right , n-1);
//    }
static void printLevel(Node root){
    Queue<Node> q = new LinkedList<>();
        if(root != null ) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.Left != null ) q.add(temp.Left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(" "+temp.data);
            q.remove();
        }

}
    public static void main(String[] args){
        Node head =null;
        int arr[] = {5,2,6,7,12,9,14,10};
        for(int item: arr){
            head = insert(head,item);

        }
        System.out.println(height(head));
         printLevel(head);

//        for(int i=1;i<=height(head)+1;i++){
//            printLevel(head,i);
//        }
    }
}
