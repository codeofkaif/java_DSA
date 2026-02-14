package Tree;


import static Tree.maxValueInTree.insert;

public class LowestCommanAncestor {
    private static int val1;
    private static int val2;

    public static Boolean check(Node root){
        if(root==null) return false;
        if(root.data == val1 || root.data ==val2) return true;
        return (check(root.Left) && check(root.right));
    }

    public static void main(String[] args) {
        Node root=null;
        int arr[] = {15 , 6,21,2,8,19,30,1,3,4};
        for(int item:arr){
            root = insert(root, item);
        }
        val1= 2;
        val2 = 30;
        if(root == null) System.out.println("null");
        if(check(root)) System.out.println("comman ancestor is: "+root.data);
        if(check(root.right)) System.out.println("comman ancestor is: "+root.data);
    }
}
