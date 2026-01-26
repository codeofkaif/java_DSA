package TreeTrevarse;

public class maxValueInTree {
    static Node insert(Node temp , int data){
        if(temp == null) return new Node(data);
        if(temp.data>data){
            temp.Left = insert(temp.Left , data);
        }
        if(temp.data<data){
            temp.right=insert(temp.right , data);
        }
        return temp;

    }
    static int height(Node root){
        if(root == null) return 0;
        if(root.Left == null && root.right == null) return 0;
        return 1+ Math.max(height(root.Left),height(root.right));
    }
//    static int maxValue(Tree.Node temp ,int Max){
//        if(temp == null ) return Max;
//        Max = Math.max(temp.data,Max);
//        Max = maxValue(temp.Left, Max);
//        Max = maxValue(temp.right, Max);
//        return Max;
//
//    }
    static int max(Node root){
        if(root == null ) return Integer.MIN_VALUE;
        int a = root.data;
        int b = max(root.Left);
        int c = max(root.right);
        return Math.max(a , Math.max(b,c));


    }

    static int productOfTree(Node root){
        if(root== null) {
            return 1;
        }

        int a = root.data;
        a*=productOfTree(root.Left);
        a*=productOfTree(root.right);
        return a;
    }
    //Print Nth level
    static void printNthLevel(Node temp , int n){
        if(temp == null) return ;
        if(n == 1) System.out.println(temp.data+" ");
        printNthLevel(temp.Left , n-1);
        printNthLevel(temp.right , n-1);
    }



    public static void main(String[] args) {
        Node root = null;
        int[] arr = {1,3,2,2,4};
        for (int item : arr){
            root = insert(root , item);
    }
        System.out.println("MaxValue of tree: "+max(root));
//        int max = maxValue(root , Integer.MIN_VALUE);
//        System.out.println("MaxValue: "+max);
        System.out.println("height of the tree: "+height(root));
        System.out.println("product of tree: " +productOfTree(root));
        System.out.println("Print 3 Levels element");

        printNthLevel(root , 3);


    }
}
