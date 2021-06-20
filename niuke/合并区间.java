import java.util.*;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 
 题目描述
给出一组区间，请合并所有重叠的区间。
请保证合并后的区间按区间起点升序排列。
示例1
输入
复制
[[10,30],[20,60],[80,100],[150,180]]
返回值
复制
[[10,60],[80,100],[150,180]]

 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        //ArrayList<Interval> res = new ArrayList<Interval>();
        if(intervals == null || intervals.size() < 2) {
            return intervals;
        }
        Collections.sort(intervals,new Comparator<Interval>() {
            @Override
            public int compare(Interval o1,Interval o2) {
                return o1.start - o2.start;
            }
        });
        for(int i = 1; i < intervals.size(); i++) {
            int preStart = intervals.get(i - 1).start;
            int preEnd = intervals.get(i - 1).end;
            int curStart = intervals.get(i).start;
            int curEnd = intervals.get(i).end;
            if(curStart <= preEnd) {
                intervals.set(i,new Interval(preStart,Math.max(preEnd,curEnd)));
                intervals.set(i - 1,null);
            }
        }
        while(intervals.remove(null));
        return intervals;
    }
}