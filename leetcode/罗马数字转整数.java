class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if(s.trim().length() == 0) {
            return sum;
        }
        return transNum(sum,s.toCharArray(),s.trim().length());
    }
    public int transNum(int sum,char[] ch,int n) {
        for(int i = 0;i < n;i++) {
            switch(ch[i]) {
                case 'I' : sum += 1;
                    break;
                case 'V' : sum += 5;
                    break;
                case 'X' : sum += 10;
                    break;
                case 'L' : sum += 50;
                    break;
                case 'C' : sum += 100;
                    break;
                case 'D' : sum += 500;
                    break;
                case 'M' : sum += 1000;
                    break;
                default : System.out.println("default");
                    break;
            }
            if(i != 0) {
                if((ch[i] == 'V' || ch[i] == 'X') && ch[i-1] == 'I') {
                    sum -= 2;
                }
                if((ch[i] == 'L' || ch[i] == 'C') && ch[i-1] == 'X') {
                    sum -= 20;
                }
                if((ch[i] == 'D' || ch[i] == 'M') && ch[i-1] == 'C') {
                    sum -= 200;
                }
            }
        }
        return sum;
    }
}