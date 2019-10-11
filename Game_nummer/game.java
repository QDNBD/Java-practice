import java.util.Random;
import java.util.Scanner;

public class game {
  public static void main(String[] arge) {
      Random random = new Random();
      Scanner sc = new Scanner(System.in);
      int answer = random.nextInt(100)+1;
      
      while(te) {
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

}