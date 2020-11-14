package arraysandstrings;
import java.util.*;

public class demo {

	public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        HashMap<HashMap<Integer,Integer>,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(1, 1);
        m.put(1, 3);
        map.put(m, 1);
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(1, 3);
        //h.put(3, 4);
        System.out.println(map.containsKey(h));
        
        

    }

}
