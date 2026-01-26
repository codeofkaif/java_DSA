import java.security.Key;
import java.util.HashMap;
import java.util.Map;
public class basicOfHashMap {
        static void hashMapMethod(){
            Map<String, Integer> mp = new HashMap<>();
		    mp.put("Akash", 21);
		    mp.put("Mojammil", 22);
            mp.put("jishan", 20);
            mp.put("faiz", 22);
            mp.put("kadir", 23);

            System.out.println(mp.keySet());
            for(String e : mp.keySet()){
                System.out.printf("Age of %s is %d\n", e, mp.get(e));
            }
            System.out.println();

            for(Map.Entry<String, Integer> e: mp.entrySet()){
                System.out.printf("Age of %s is %d\n ", e.getKey(), e.getValue());
            }
            System.out.println();
            for(var e: mp.entrySet()){
                System.out.printf("Age of %s is %d\n ", e.getKey(), e.getValue());
            }

        }

        public static void main(String[] arg){
            hashMapMethod();
        }
    }

