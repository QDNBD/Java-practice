class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        if(len1 < 0 || len2 < 0) {
            return "";
        }
        int[] nums = new int[len1 + len2 + 2];
        for(int i = len1; i >= 0; i--) {
            for(int j = len2; j >= 0; j--) {
                int sum = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                sum += nums[i + j + 1]; // 先加低位判断是否有新的进位
                nums[i + j] += sum / 10;
                nums[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < nums.length - 1 && nums[i] == 0) {
            i++;
        }
        while(i < nums.length) {
            sb.append(nums[i]);
            i++;
        }
        return sb.toString();
    }
}