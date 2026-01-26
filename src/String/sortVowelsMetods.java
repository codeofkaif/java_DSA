package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortVowelsMetods {
    public static void main(String[] args) {
        String str = sortVowels("lEedcOde");
        for(char ch : str.toCharArray()){
            System.out.println(ch);
        }


    }

    public static String sortVowels(String s) {
            String str ="";
            List<Character> list = new ArrayList<>();
            for(char ch : s.toCharArray()){
                if(isVowel(ch)){
                    list.add(ch);
                }
            }

            for(char item : list){
                System.out.println(item);
            }
        System.out.println();
            Collections.sort(list);
            int j=0;
        System.out.println(s.length());
            for(int i =0; i<s.length();i++ ){
                if(isVowel(s.charAt(i))){
                    str+=""+list.get(j);
                    System.out.println(i);
                    j++;

                }
                else{
                    str+=""+s.charAt(i);
                    System.out.println(i);
                }

            }
            return str;
        }
        private static boolean isVowel(char ch){
            if(ch == 'A' || ch == 'a') return true;
            if(ch == 'E' || ch == 'e') return true;
            if(ch == 'I' || ch == 'i') return true;
            if(ch == 'O' || ch == 'o') return true;
            if(ch == 'U' || ch == 'u') return true;
            return false;
        }
    }

