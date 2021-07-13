class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n <= 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        int third = 1;
        while(n > 2) {
            third = (second + first) % 1000000007;
            first = second;
            second = third;
            n--;
        }
        return third;
    }
}