import java.util.Scanner;

public class test {
/*
// �ݹ��� N �Ľ׳�
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
    
//�ݹ��� 1 + 2 + 3 + ... + 10
  public static void main2(String[] args) {
  

      System.out.println(fact(10));
  }
  
  public static int fact(int num) {
         
      if(num == 1) {
          return 1;
      }return num + fact(num - 1);
      
  }

// ��˳���ӡһ�����ֵ�ÿһλ(���� 1234 ��ӡ�� 1 2 3 4)
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

//дһ���ݹ鷽��������һ���Ǹ����������������������֮��.
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
 
// ��쳲��������еĵ� N ��
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
 
//��⺺ŵ������(��ʾ, ʹ�õݹ�)  
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
//������̨������(��ʾ, ʹ�õݹ�)
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("��������̨�Ľ���(̨������Ϊ0):");
        int num = in.nextInt();  //����һ��������
        while(num == 0){
            System.out.println("��������̨�Ľ���(̨������Ϊ0):");
            num = in.nextInt();  //����һ��������
        }
        System.out.println("����"+countOfJumping(num)+"������");  //����ͳ��������̨����������
    }
    //ͳ��������̨����������
    public static int countOfJumping(int num){
        int result = 0;
        if (num == 1){  //�ݹ�߽�
            return 1;
        }
        if (num == 0){  //�ݹ�߽�
            return 1;
        }
        result = countOfJumping(num-1) + countOfJumping(num-2);  //�ݹ��������
        return result;
    }

 








}