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
//             首先看十进制是如何做的： 5+7=12，三步走
//             第一步：相加各位的值，不算进位，得到2。
//             第二步：计算进位值，得到10. 如果这一步的进位值为0，那么第一步得到的值就是最终结果。

//             第三步：重复上述两步，只是相加的值变成上述两步的得到的结果2和10，得到12。
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}