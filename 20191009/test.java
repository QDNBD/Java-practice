public class test {
 /*
  public static void main(String[] args) {
 
  int num = 5;
  int i = 1;
  int ret = 1;
  int sum = 0;
  while(i <= num) {
  ret *= i;
  sum += ret;
  i++;
  
  }
  System.out.println(sum);
  
  }
  */

/**
�������� int ����, ����������ֵ. 
*/

/*
  public static void main(String[] args) {
  
  int x = 1;
  int y = 8;
  int t = 0;
    t = x;
    x = y;
    y = t;
  System.out.println(x);
  System.out.println(y);
  }

*/

/**
�������� int ����, �����е����ֵ����Сֵ. 
*/

  public static void main(String[] args) {
  
  int x = 2;
  int y = 4;
  int z = 6;
  int num = x;
  
  if(x < y) {
  num = x;
  x = y;
  y = num;
  
  }
  if(x < z) {
  num = x;
  x = z;
  z = num;
  
  }
  if(y < z) {
  num = y;
  y = z;
  z = num;
  
  }
  
  System.out.println(x);
  System.out.println(z);
  
  
}
}