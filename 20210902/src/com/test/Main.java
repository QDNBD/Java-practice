package com.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
            }
            if(s.length <= 2) {
                break;
            }
            int[][] arr = new int[s.length - 2][2];
            for(int i = 0; i < s.length - 2; i++) {
                arr[i][0] = (int) s[i + 1].charAt(1) - '0';
                arr[i][1] = (int) s[i + 1].charAt(3) - '0';
                //System.out.println(arr[i][0] + arr[i][1]);
            }
            System.out.println(helpContion(arr));
        }
        sc.close();
    }

    private static int helpContion(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int res = 0;
        int len = arr.length;
        if(len == 0) {
            return  res;
        }
        int[] num = arr[0];
        for(int i = 1; i < len; i++) {
            if(arr[i][0] < num[1]) {
                res++;
                num[1] = Math.min(arr[i][1], num[1]);
            }else {
                num = arr[i];
            }
        }
        return res;
    }
}

    create table VIP_USER(id int primary key not null,  name varchar(30),  deadline DATE,  vip_type int);
        insert into VIP_USER(id,name,deadline,vip_type) values(1,'Joe', '2021-10-01 00:00:00', 1);
        insert into VIP_USER(id,name,deadline,vip_type) values(2,'Jim', '2021-12-05 00:00:00', 1);
        insert into VIP_USER(id,name,deadline,vip_type) values(3,'Tom', '2021-11-02 00:00:00', 2);
        insert into VIP_USER(id,name,deadline,vip_type) values(4,'Mary', '2021-09-03 00:00:00', 2);
        insert into VIP_USER(id,name,deadline,vip_type) values(5,'Lucy', '2021-12-05 00:00:00', 1);
        insert into VIP_USER(id,name,deadline,vip_type) values(6,'Henry', '2021-08-19 00:00:00', 1);
        insert into VIP_USER(id,name,deadline,vip_type) values(7,'Bill', '2021-08-31 00:00:00', 1);

        create table VIP_TYPE(id int primary key not null,  name varchar(30));
        insert into VIP_TYPE(id,name) values(1,"黄金会员");
        insert into VIP_TYPE(id,name) values(2,'钻石会员');