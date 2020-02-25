import java.util.Scanner;

public class test {
/*
// 递归求 N 的阶乘
  public static void main1(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(fact(num));
      sc.close();
  }
  
  public static int fact(int num) {
         
      if(num == 1) {
          return 1;
      }return num * fact(num - 1);
      
  }
    
//递归求 1 + 2 + 3 + ... + 10
  public static void main2(String[] args) {
  

      System.out.println(fact(10));
  }
  
  public static int fact(int num) {
         
      if(num == 1) {
          return 1;
      }return num + fact(num - 1);
      
  }

// 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
  public static void main3String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      fact(num);
      sc.close();
  }
  
  public static void fact(int num) {
         
      if(num > 9) {
          fact(num / 10);
      } System.out.println(num % 10);
     
      
  }

//写一个递归方法，输入一个非负整数，返回组成它的数字之和.
  public static void main4(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(fact(num));
      sc.close();
  }
  
  public static int fact(int num) {
         
      if(num < 10) {
          return num;
      } 
      return num % 10 + fact(num / 10);
     
      
  }                                                          
 
// 求斐波那契数列的第 N 项
  public static void main5(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(fib(num));
      sc.close();
  }
  
  public static int fib(int num) {
         
      if(num == 1 || num == 2) {
          return 1;
      }
      return fib(num -1) + fib(num -2);
     
      
  }         
 
//求解汉诺塔问题(提示, 使用递归)  
  public static void main6(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      char pos1 = 'A';
      char pos2 = 'B';
      char pos3 = 'C';
      Hnta(num,pos1,pos2,pos3);
      sc.close();
  }
  
  public static void move(char pos1,char pos2) {
         
      System.out.println(pos1 + "->" + pos2);
  }
  
  public static void Hnta(int num,char pos1,char pos2,char pos3) {
  
      if(num == 1) {
          move(pos1,pos3);
      }else {
          Hnta(num-1,pos1,pos3,pos2);
          move(pos1,pos3);
          Hnta(num-1,pos2,pos1,pos3);
      }
  }
*/    
//青蛙跳台阶问题(提示, 使用递归)
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入跳台的阶数(台阶数不为0):");
        int num = in.nextInt();  //接收一个正整数
        while(num == 0){
            System.out.println("请输入跳台的阶数(台阶数不为0):");
            num = in.nextInt();  //接收一个正整数
        }
        System.out.println("共有"+countOfJumping(num)+"种跳法");  //调用统计青蛙跳台方案数方法
    }
    //统计青蛙跳台方案数方法
    public static int countOfJumping(int num){
        int result = 0;
        if (num == 1){  //递归边界
            return 1;
        }
        if (num == 0){  //递归边界
            return 1;
        }
        result = countOfJumping(num-1) + countOfJumping(num-2);  //递归调用自身
        return result;
    }

 








}