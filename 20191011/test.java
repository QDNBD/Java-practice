import java.util.Scanner;
import java.util.Random;

public class test {
/*
// 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
  public static void main1(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      
      if(age <= 18) {
          System.out.println("少年");
      }else if(age <= 28) {
          System.out.println("青年");
      }else if(age <= 55) {
          System.out.println("中年");
      }else {
          System.out.println("老年");
      }
      
      sc.close();
  }

// 判定一个数字是否是素数 
  public static void main2(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      boolean lin = true;
      if(lin == prime(num)) {
        System.out.println("是素数");
      }else {
        System.out.println("不是素数");
      }
      sc.close();
  }
  
  public static boolean prime(int n) { 
      
      if (n < 2)
        return false;
      for (int i = 2; i < n; ++i)
        if (n % i == 0)
          return false;
      return true;
  }

  
//打印 1 - 100 之间所有的素数 
  public static void main3(String[] arge) {
  
      
      for(int i = 2;i <= 100; i++) {
          int count = 0;
          for(int j = 2;j < i;j++) {
              if(i%j == 0) {
                  count++;
              }
          }
          if(count == 0) {
              System.out.println(i);
          }
      } 
  }
  
  
//输出 1000 - 2000 之间所有的闰年
   public static void main4(String[] arge) {
   
      for(int i = 1000;i <= 2000; i++) {
          if((i%4 == 0 && i%100 != 0) || (i%400 == 0)) {
                  System.out.println(i);
              }
      } 
   }

// 输出乘法口诀表 
  public static void main5(String[] arge) {
    
    for(int i = 1;i <= 9;i++) {
        for(int j = 1;j <= i;j++) {
            System.out.print(j+"*"+i+"="+i*j+"\t"); 
        }System.out.println();
    }
  }

// 求两个正整数的最大公约数 
  public static void main6(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      while (a != b) {
        if (a > b){
            a = a - b;
        }else {
            b = b - a;
         }
      }System.out.println("最大公约数是:" + a);
    
  }

//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
  public static void main7(String[] arge) {
  
      double sum = 0.0;
      double j = 1;
      for(int i = 1;i <= 100;i++) {
          sum += j / (double)i;
          j = -j;
      }System.out.println(sum);
  }
  
// 编写程序数一下 1到 100 的所有整数中出现多少个数字9
  public static void main8(String[] arge) {
  
      int count = 0;
      for(int i = 1;i < 100;i++) {
          if(i%10 == 9) {
              count++;
              System.out.println(i);
          }if(i/10 == 9) {
                count++;
                System.out.println(i);
          }
      
      }System.out.println(count);
      
  }
//求出0～999之间的所有“水仙花数”并输出。(“
  public static void main9(String[] arge) {
  
      for(int i = 10;i < 100;i++) {
          int g = i % 10;
          int s = i / 10;
          if(i == g*g*g + s*s*s) {
              System.out.println(i);
          }
      }
      for(int i = 100;i < 1000;i++) {
          int g = i % 10;
          int s = (i / 10) % 10;
          int b = i / 100;
          if(i == g*g*g + s*s*s + b*b*b) {
              System.out.println(i);
          }
      }
  }

//编写代码模拟三次密码输入的场景。 最多能输入三次密码
  public static void main10(String[] arge) {
  
        String lin = "123";
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 3) {
            String input = sc.nextLine();
            if(lin.equals(input)) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码错误" + "还剩" + (2-i) + "次");
            } i++;
        }
        sc.close();
  }

//写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1 
  public static void main11(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count = 0;
      while(num != 0) {
          if(num % 2 == 1) {
              count++;
          }num /= 2;
      }System.out.println("该数字共有" + count + "个1");
      sc.close();
  }
*/ 
//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。 
//运行时错误
  public static void main12(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] arr1 = {0};
      int[] arr2 = {0};
      int i = 0;
      int j = 0;
      for(i = 0,j = 0; i < 32;i += 2) {
          arr1[j] = ((num >> i) & 1);
          j++;
      }
      for(i = 1,j = 0; i < 1;i += 2) {
          arr2[j] = ((num >> i) & 1);
          j++;
      }
      System.out.println("奇数序列：");
      for(i = 15;i >= 0;i--) {
         System.out.print(arr1[i]);
      }
   
      System.out.println("偶数序列：");
      for(i = 15;i >= 0;i--) {
         System.out.print(arr1[i]);
      }
      sc.close();
  }
 /*
//输出一个整数的每一位. 
  public static void main13(String[] arge) {
   
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      func(num);
      sc.close();
   
  }
   
  public static void func(int num) {
  
      System.out.println("从个位开始依次是:") ;
      while(num > 0) {
          System.out.println((num % 10));
          num /= 10;
      }
  }

  //完成猜数字游戏
  public static void main14(String[] arge) {
      Random random = new Random();
      Scanner sc = new Scanner(System.in);
      int answer = random.nextInt(100)+1;
      
      while(true) {
          System.out.println("请输入你猜的数字: (1-100)");
          int num = sc.nextInt();
          if(num < answer) {
              System.out.println("小了");
          } else if (num > answer) {
               System.out.println("高了");
          } else {
               System.out.println("猜对了");
               break;
          }
      
      }
      sc.close();
  }
*/

}