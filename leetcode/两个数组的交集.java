class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return null;
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num : nums2) {
            if(set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int start = 0;
        for(int num : set2) {
            res[start] = num;
            start++;
        }
        return res;
    }
}