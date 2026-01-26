package Backtracking;


import java.util.*;

public class LetterCombination {
    public static void main(String[] args) {
        String digit = "2543";
        List<String> ans = new ArrayList<>();
        HashMap <Character, String> charToSting = new HashMap<>();
        charToSting.put('2' ,"abc");
        charToSting.put('3' ,"def");
        charToSting.put('4' ,"ghi");
        charToSting.put('5' ,"jkl");
        charToSting.put('6' ,"mno");
        charToSting.put('7' ,"pqrs");
        charToSting.put('8' ,"tuv");
        charToSting.put('9' ,"wxyz");
        combination(digit , 0 , new StringBuilder(), charToSting , ans);
        for(String item : ans){
            System.out.print(item+" ");
        }


    }
    private static void combination(String digit , int idx , StringBuilder comb , HashMap<Character, String> charToString ,List<String> ans ){
        if(idx == digit.length()){
            ans.add(comb.toString());
            return;
        }
        String letter = charToString.get(digit.charAt(idx));
        for(char ch:letter.toCharArray()){
            comb.append(ch);
            combination(digit , idx+1 , comb ,charToString, ans);
            comb.deleteCharAt(comb.length()-1);
        }
    }

}
