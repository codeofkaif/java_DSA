package Backtracking;

public class Perputation {
    public static void main(String[] args) {
        printPermutation("abc","");
    }
    public static void printPermutation(String str, String t){
        if(str.isEmpty()){
            System.out.println(t);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
//            String left = str.substring(0 , i);
//            String rigth = str.substring(i+1);
//            String rem = left+rigth;
//            printPermutation(rem , t+ch);
            printPermutation(str.substring(0,i)+str.substring(i+1) , t+ch);
        }
    }

}
