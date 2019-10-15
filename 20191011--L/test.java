public class test {
  public static void main(String[] arge) {
  int num = 5;
  int i = 1;
  int ret = 1;
  int sum = 0;
  for(i = 1;i <= num; i++) {
  ret *= i;
  sum += ret;
  
  }
  System.out.println(sum);
  
  
  
  /*
  int i = 0;
  int sumAdd = 0;
  int sumEve = 0;
  for(i = 1; i<=100; i += 2) {
  sumEve += i;
  }
  for(i = 0; i<=100; i += 2) {
  sumAdd += i;
  }
  
  System.out.println("sumEve = " + sumEve);
  System.out.println("sumAdd = " + sumAdd);
  */
  }
}