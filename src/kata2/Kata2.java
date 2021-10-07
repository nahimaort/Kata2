package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        Integer[] data = {1, 4, 2, 6, 100, -4, 100, 6, 4, 5, 6, 100, 5, 8, 6, 1, 2, 
            100, 6, 1, 100, 5, 4, 5, 6, 8, 5, 100, 4, 6, 100, 5, 6, 4, 6};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
