class Solution {
    public String addBinary(String a, String b) {
        int num = 0;//�����Ƿ��λ��
        StringBuilder ant = new StringBuilder();
        for(int i=a.length()-1,j=b.length()-1;i>=0 || j>=0;i--,j--) {
            int sum = num;
            sum += (i >= 0 ? a.charAt(i) - '0' : 0);//�ַ���1��ascllֵ��49��Ҫ�����0��1Ҫ��ȥ�ַ�'0'
            sum += (j >= 0 ? b.charAt(j) - '0' : 0);
            ant.append(sum%2);
            num = sum / 2;
        }
        ant.append(num == 1 ? num : "");
        return ant.reverse().toString();
    }
}