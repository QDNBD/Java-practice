//����һ������Ϊn�����ӣ�������Ӽ�����������m�Σ�m��n����������n>1����m>1��m<=n����
//ÿ�����ӵĳ��ȼ�Ϊk[1],...,k[m]������k[1]x...xk[m]���ܵ����˻��Ƕ��٣�
//���磬�����ӵĳ�����8ʱ�����ǰ������ɳ��ȷֱ�Ϊ2��3��3�����Σ���ʱ�õ������˻���18��

import java.util.*;

public class Solution {
    public int cutRope(int target) {
        if(target == 2) {
            return 1;
        }
        if(target == 3) {
            return 2;
        }
        int count = 0;
        if(target % 3 == 0) {
            count = 1;
            return (int)Math.pow(3,target/3)*count;
        }else if(target % 3 == 1) {
            return (int)Math.pow(3,target/3 -1)*4;
        }else if(target % 3 == 2) {
            count = target % 3;
        }
        return (int)Math.pow(3,target/3)*count;
    }
}