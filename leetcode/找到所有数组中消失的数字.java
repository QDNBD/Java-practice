class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //������������Ϊ�����±꣬�ö�Ӧ����ֵΪ��ֵ����ô����Ϊ������λ�ü�Ϊ��δ���ֹ�����ʧ�����֡�
        // List<Integer> ret = new ArrayList<>();
        // for(int i = 0;i < nums.length;i++) {
        //     if(nums[Math.abs(nums[i]) - 1] > 0) {
        //         nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
        //     }
        // }
        // for(int i = 0;i < nums.length;i++) {
        //     if(nums[i] > 0) {
        //         ret.add(i+1);
        //     }
        // }
        // return ret;


        //�����е���ֵ��Ϊ��Ӧ��int���飬��ֵ�����Ժ�int��Ӧ�µ�����++��
        List<Integer> ret = new ArrayList<>();
        int[] list = new int[nums.length + 1];
        for(int i = 0;i < nums.length;i++) {
            list[nums[i]]++;
        }
        for(int i = 1;i < list.length;i++) {
            if(list[i] == 0) {
                ret.add(i);
            }
        }
        return ret;
    }
}