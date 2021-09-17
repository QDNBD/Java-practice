package com.test;

public class test9 {
    public static void main(String[] args) {

    }
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param n int整型
         * @param k int整型
         * @return long长整型
         */
        public static  long minM (int n, int k) {
            if(k == 10) {
                long i = 1;
                long count = 0;
                while(count < n) {
                    long temp = i;
                    while(temp > 0) {
                        if(temp % 10 == 1) {
                            count++;
                        }
                        temp /= 10;
                    }
                    if(count >= n) {
                        return i;
                    }
                    i++;
                }
            }
            // write code here
            long x = k;
            int count = 0;
            long i = 1;
            while(count < n) {
                long num = i;
                int index = 0;
                long res = 0;
                if(i < x) {
                    res = i;
                }else {
                    while(num > 0) {
                        long s = (long)Math.pow(10, index);
                        long t = num % x;
                        res = res + t * s;
                        num /= 10;
                        index++;
                    }
                }
                long temp = res;
                while(temp > 0) {
                    if(temp % 10 == 1) {
                        count++;
                    }
                    temp /= 10;
                }
                if(count >= n) {
                    return i;
                }
                i++;
            }
            return i - 1;

        }
    
}
