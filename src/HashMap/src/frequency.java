import java.util.HashMap;
import java.util.Map;
public class frequency {
    public static void main(String[] args){
        Map<Integer, Integer> mp= new HashMap<>();
        int[] arr= {1,3,2,1,4,1};
        for(int i:arr){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }
        System.out.println("frequince map");
        System.out.println(mp.entrySet());

        //max-frequency
        int max_fre = 0;
        Integer keyValue = -1;
//        for(var e : mp.entrySet()){
//            if(max_fre<e.getValue()){
//                max_fre=e.getValue();
//                keyValue =e.getKey();
//            }
//
//        }
        for(var e : mp.keySet()){
            if(max_fre<mp.get(e)){
                max_fre=mp.get(e);
                keyValue = e;
            }

        }
        System.out.printf("%d has max frequency and it occurs %d times", keyValue, max_fre);
    }
}
