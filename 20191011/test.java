import java.util.Scanner;
import java.util.Random;

public class test {
/*
// ��������, ����ӡ����ǰ�������������(����18), ����(19-28), ����(29-55), ����(56����) 
  public static void main1(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      
      if(age <= 18) {
          System.out.println("����");
      }else if(age <= 28) {
          System.out.println("����");
      }else if(age <= 55) {
          System.out.println("����");
      }else {
          System.out.println("����");
      }
      
      sc.close();
  }

// �ж�һ�������Ƿ������� 
  public static void main2(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      boolean lin = true;
      if(lin == prime(num)) {
        System.out.println("������");
      }else {
        System.out.println("��������");
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

  
//��ӡ 1 - 100 ֮�����е����� 
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
  
  
//��� 1000 - 2000 ֮�����е�����
   public static void main4(String[] arge) {
   
      for(int i = 1000;i <= 2000; i++) {
          if((i%4 == 0 && i%100 != 0) || (i%400 == 0)) {
                  System.out.println(i);
              }
      } 
   }

// ����˷��ھ��� 
  public static void main5(String[] arge) {
    
    for(int i = 1;i <= 9;i++) {
        for(int j = 1;j <= i;j++) {
            System.out.print(j+"*"+i+"="+i*j+"\t"); 
        }System.out.println();
    }
  }

// �����������������Լ�� 
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
      }System.out.println("���Լ����:" + a);
    
  }

//����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ��
  public static void main7(String[] arge) {
  
      double sum = 0.0;
      double j = 1;
      for(int i = 1;i <= 100;i++) {
          sum += j / (double)i;
          j = -j;
      }System.out.println(sum);
  }
  
// ��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9
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
//���0��999֮������С�ˮ�ɻ������������(��
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

//��д����ģ��������������ĳ����� �����������������
  public static void main10(String[] arge) {
  
        String lin = "123";
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 3) {
            String input = sc.nextLine();
            if(lin.equals(input)) {
                System.out.println("��¼�ɹ�");
                break;
            }else {
                System.out.println("�������" + "��ʣ" + (2-i) + "��");
            } i++;
        }
        sc.close();
  }

//дһ���������ز����������� 1 �ĸ��� ���磺 15 0000 1111 4 �� 1 
  public static void main11(String[] arge) {
  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count = 0;
      while(num != 0) {
          if(num % 2 == 1) {
              count++;
          }num /= 2;
      }System.out.println("�����ֹ���" + count + "��1");
      sc.close();
  }
*/ 
//��ȡһ�������������������е�ż��λ������λ�� �ֱ�������������С� 
//����ʱ����
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
      System.out.println("�������У�");
      for(i = 15;i >= 0;i--) {
         System.out.print(arr1[i]);
      }
   
      System.out.println("ż�����У�");
      for(i = 15;i >= 0;i--) {
         System.out.print(arr1[i]);
      }
      sc.close();
  }
 /*
//���һ��������ÿһλ. 
  public static void main13(String[] arge) {
   
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      func(num);
      sc.close();
   
  }
   
  public static void func(int num) {
  
      System.out.println("�Ӹ�λ��ʼ������:") ;
      while(num > 0) {
          System.out.println((num % 10));
          num /= 10;
      }
  }

  //��ɲ�������Ϸ
  public static void main14(String[] arge) {
      Random random = new Random();
      Scanner sc = new Scanner(System.in);
      int answer = random.nextInt(100)+1;
      
      while(true) {
          System.out.println("��������µ�����: (1-100)");
          int num = sc.nextInt();
          if(num < answer) {
              System.out.println("С��");
          } else if (num > answer) {
               System.out.println("����");
          } else {
               System.out.println("�¶���");
               break;
          }
      
      }
      sc.close();
  }
*/

}