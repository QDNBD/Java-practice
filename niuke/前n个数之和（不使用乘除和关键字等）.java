public class Solution {
    public int Sum_Solution(int n) {
        int ret = n;
        boolean stop = (ret != 0) && ((ret += Sum_Solution(n-1)) != 0);//���ϵ���ֱ��n=0Ȼ��ع鷵�أ����岼������ֻ��Ϊ��ʹ�õ�����
        return ret;
    }
}