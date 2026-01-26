package String;
import java.lang.String;

public class Substring {
    public static void main(String[] args) {
        String str="Kaif";
        //print sub array
        for (int i =0;i<str.length();i++){
            for(int j = i;j<str.length();j++){
                System.out.print(" "+str.substring(i,j+1));

            }

        }
    }
}
