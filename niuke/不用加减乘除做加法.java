public class Solution {
    public int Add(int num1,int num2) {
//         int res;
//         int ans;
//         do{
//             res = num1 ^ num2;
//             ans = (num1 & num2) << 1;
//             num1 = res;
//             num2 = ans;
//         }while(ans != 0);
//         return res;
        
        while (num2!=0) {
//             ���ȿ�ʮ������������ģ� 5+7=12��������
//             ��һ������Ӹ�λ��ֵ�������λ���õ�2��
//             �ڶ����������λֵ���õ�10. �����һ���Ľ�λֵΪ0����ô��һ���õ���ֵ�������ս����

//             ���������ظ�����������ֻ����ӵ�ֵ������������ĵõ��Ľ��2��10���õ�12��
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}