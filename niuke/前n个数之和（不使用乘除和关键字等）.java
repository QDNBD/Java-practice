public class Solution {
    public int Sum_Solution(int n) {
        int ret = n;
        boolean stop = (ret != 0) && ((ret += Sum_Solution(n-1)) != 0);//不断迭代直到n=0然后回归返回（定义布尔类型只是为了使用迭代）
        return ret;
    }
}