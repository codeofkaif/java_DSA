package Tree;

import java.util.ArrayList;
import java.util.List;



public class binaryTreePath {
    public static void helper(Node root ,List<String> list , String path){
        if(root == null) return;
        if(root.Left== null && root.right == null){
            path += root.data;
            list.add(path);
            return;
        }
        helper(root.Left , list ,path+ root.data+"->");
        helper(root.right , list ,path+ root.data+"->");
        }

    public static void main(String[] args) {
        Insertion insert = new Insertion();
        Node root = null;
        int arr[]={2,5,7,1,3,6,8};
        for (int item : arr) {
            root = insert.insertion(root, item);
        }
        List<String>list=new ArrayList<>();
        helper(root , list , "");
        System.out.println(list);
    }


    }



