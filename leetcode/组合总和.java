import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        getCombination(candidates,target,0,res,list);
        return res;
    }
    private void getCombination(int[] candidates,int target,int index,List<List<Integer>> res,ArrayList<Integer> list) {
        if(target < 0) {
            return ;
        }
        if(0 == target) {
            int count = 0;
            for(int i = 0;i < list.size() - 1;i++) {
                if(list.get(i) <= list.get(i+1)) {
                    count++;
                }
            }
            if(count == list.size() - 1) {
                res.add(new ArrayList(list));
            }
            
        }
        for(int i = index;i < candidates.length && candidates[i] <= target;i++) {
            if(target < 0) {
                break;
            }
            list.add(candidates[i]);
            getCombination(candidates,target - candidates[i],index,res,list);
            list.remove(list.size() - 1);
        }
        
    }
}