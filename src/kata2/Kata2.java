package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = {1, 4, 2, 6, 100, -4, 100, 6, 4, 5, 6, 100, 5, 8, 6, 1, 2, 
            100, 6, 1, 100, 5, 4, 5, 6, 8, 5, 100, 4, 6, 100, 5, 6, 4, 6};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
