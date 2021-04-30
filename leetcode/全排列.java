class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        getPermute(nums,res,list);
        return res;
    }
    private void getPermute(int[] nums,List<List<Integer>> res,ArrayList<Integer> list) {
        if(list.size() == nums.length) {
            res.add(new ArrayList(list));
            return ;
        }
        for(int num : nums) {
            if(!list.contains(num)) {
                list.add(num);
                getPermute(nums,res,list);
                list.remove(list.size() - 1);
            }
        }
    }
}