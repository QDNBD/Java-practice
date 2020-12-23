public class Solution {
    public boolean match(char[] str, char[] pattern) {
        if(str == null && pattern == null) {
            return true;
        }
        return matchHelp(str,0,pattern,0);
    }
    
     /* ����2�֣��ȿ� * �ٿ� ƥ��
     * ǰ�᣺��pattern�����꣬returnȡ����str�Ƿ�����꣬strǡ�ñ�����ŷ���true���ٽ���������
     *  1.����ǰ�ַ�������һ���ַ�������һ���ַ��Ƿ��� '*'������ǣ���2�����
     *      һ����ǰƥ��
     *      1.1match(str,i + 1,pattern,j)//����str
     *      1.2match(str,i,pattern,j + 2)//����pattern
     *      1.3match(str,i + 1,pattern,j + 2)//��һ�ֿ���ʡ�ԣ��൱�� 1.1 + 1.2
     *      ������ǰ��ƥ��
     *      match(str,i,pattern,j + 2)//����pattern
     * 2.��һ������ *
     *     ��ǰƥ�� return match(str,i + 1,pattern,j + 1)
     */
    private boolean matchHelp(char[] str,int i,char[] pattern,int j) {
        if(j == pattern.length) {//�����Ƿ�ƥ������
            return i == str.length;
        }
        if(j < pattern.length - 1 &&  pattern[j+1] == '*') {
            if(str.length != i && //ƥ��
              (str[i] == pattern[j] || pattern[j] == '.')) {
                return matchHelp(str,i + 1,pattern,j) || matchHelp(str,i,pattern,j + 2);
            }else {
                return matchHelp(str,i,pattern,j+2);
            }
        }
        if(str.length != i && (str[i] == pattern[j] || pattern[j] == '.')) {
            return matchHelp(str,i+1,pattern,j+1);
        }
        return false;
    }
}