class Solution {
    public int translateNum(int num) {
        if(num <= 9) {
            return 1;
        }
        int temp = num % 100;
        if(temp <= 9 || temp >= 26) {
            return translateNum(num / 10);
        }else {
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }
}