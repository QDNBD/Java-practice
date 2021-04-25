import java.util.*;

//����ֻ�ñȽ�3���������ڳ�2����С���������ڳ�3����С���������ڳ�5����С��
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) {
            return 0;
        }
        if(index == 1) {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while(list.size() < index) {
            int m2 = list.get(i2) * 2;
            int m5 = list.get(i5) * 5;
            int m3 = list.get(i3) * 3;
            int min = Math.min(m2,Math.min(m3,m5));
            list.add(min);
            if(min == m2) i2++;
            if(min == m3) i3++;
            if(min == m5) i5++;
        }
        return list.get(list.size()-1);
    }
}