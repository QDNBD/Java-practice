class Solution {
    public int mySqrt(int x) {
        //���ֲ��� [0, x] ֮��
        int left = 0;
        int right = x;
        while(left < right){
            /*
            ����Ϊʲôʹ�õ��� (left + right + 1) >>> 1 �� �����Ǹ�֮ǰһ��ʹ�� (left + right) >>> 1 ��
            ��Ϊ����������Ҫ���� right = mid - 1 ������ left = mid + 1����� (left + right) >>> 1 �Ļ� left = mid ���ܻ������ѭ��

            Ϊʲôʹ�� right = mid - 1��
            �ڲ����� һ������ƽ������ x ������£����� x = 8�������������
            ��Ϊ����Ҫ����� ���ڵ������� x1 �� x2 ��x1 ��ƽ���� x С�� x2 ��ƽ���� x ��
            ���� x = 8����ô x1 = 2, x2 = 3
            ��������Ҫ���ص��� x1 = 2������С��ֵ����ˣ�������������ֵ��ʱ����Ҫ�����ô�ֵ����Сֵ������
            ������������Сֵ���Ҵ�ֵ��ͬ
            ����������Ķ��ֲ���ģ�壬��ô�� break �ҵ��ľͻ��� x2 = 3
            */
            int mid = (left + right + 1) >>> 1;
            //ע�⣺�а����� 2147395599����� mid ƽ���ᳬ�� int �������Ҫ��ƽ�����תΪ long 
            if((long)mid * mid > x){
                right = mid - 1;
            }else{
                left = mid;
            }
        }
        return left;
    }
}


class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        long i = 1;
        while(i <= x/2) {
            if((i*i < x && (i + 1) * (i + 1) > x) || i * i == x) {
                return (int)i;
            }
            i++;
        }
        return -1;
    }
}

class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        if(x == 1) {
            return 1;
        }
        long left = 1;
        long right = x / 2 + 1;
        while(left <= right) {
            long mid = (left + right) / 2;
            if(mid * mid < x) {
                left = mid + 1;
            }else if(mid * mid > x) {
                right = mid - 1;
            }else {
                return (int)mid;
            }
        }
        return (int)(left - 1);
    }
}