/*
public class test {
  public static void main(String[] args) {
  
  int num = 12345;
  print(num);
  }
  
  
public static void print(int num) {

    if(num > 9) {
     print(num / 10);
    }
   System.out.println(num % 10);
}
}



public class test {
  public static void main(String[] args) {
  
      int num = sum(10);
      System.out.println(num);
  }
  
public static int sum(int num) {

    if(num == 1) {
        return 1;
    }
   return num + sum(num - 1);
}
}  
*/

import java.util.Scanner;

public class test {
   public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(add(num));
   
   }
   public static int add(int num) {
      if(num == 1 || num == 2) {
          return num;
      } else {
          return add(num - 1) + add(num - 2);
      }
      
   }



/*
  public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(add(num));
      
  }
public static int add(int num) {

    if(num <= 9) {
        return num;
    }
    return num % 10 + add(num / 10);
}
*/
}