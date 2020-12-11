import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        int plow = 1;
        int phigh = 2;
        while(phigh > plow) {
            int cur = (plow + phigh) * (phigh - plow + 1) / 2;
            if(cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = plow;i <= phigh;i++) {
                    list.add(i);
                }
                result.add(list);
                plow++;
            }else if(cur > sum) {
                plow++;
            }else {
                phigh++;
            }
        }
        return result;
    }
}