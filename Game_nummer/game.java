import java.util.Random;
import java.util.Scanner;

public class game {
  public static void main(String[] arge) {
      Random random = new Random();
      Scanner sc = new Scanner(System.in);
      int answer = random.nextInt(100)+1;
      
      while(te) {
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

}