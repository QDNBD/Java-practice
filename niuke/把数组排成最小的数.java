import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0) {
            return new String();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int e : numbers) {
            list.add(e);
        }
        
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer x,Integer y) {
                String xs = x + "" + y;
                String ys = y + "" + x;
                return xs.compareTo(ys);
            }
        });
        String result = new String();
        for(Integer e : list) {
            result += e;
        }
        return result;
    }
}