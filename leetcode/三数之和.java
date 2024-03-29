class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3)
            return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = nums.length - 1;
            int sum = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right] == sum) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if (nums[left] + nums[right] > sum) {
                    //这里不进行去重也是可以的
                    //while (left < right && nums[right] == nums[right - 1]) right--;
                    right--; 
                }
                else {
                    //while (left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                }   
            }
        }
        return ans;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) {
            return res;
        } 
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                continue;
            }
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1; 
            int right = nums.length - 1;
            while(left < right) {
                if(nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                }else if(nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                }else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    while(left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while(left < right && nums[right - 1] == nums[right]){
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}