package java_collection_framework;
import java.sql.SQLOutput;
import java.util.ArrayList;//it is interface of arrayList
public class Array_List {
        public static void main(String[] args) {
            ArrayListExample();
        }
        static void ArrayListExample(){
            ArrayList<Integer> l=new ArrayList<>();
            l.add(2);// it for add any number in arraylist
            l.add(8);
            l.add(3);
            System.out.println(l);// output  2,8,3
            System.out.println(l.get(2));//it will give the output->3
            l.set(1,4);//it is for modifying at index x
            System.out.println(l);//it will give the answer->2,4,3
            System.out.println(l.contains(4));// it will give answer in boolean true or false


        }

    }

