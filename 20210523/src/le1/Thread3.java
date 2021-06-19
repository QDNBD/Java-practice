package le1;

public class Thread3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
          @Override
          public void run() {
              while (true) {

              }
          }
        };
        t.start();
        while (true) {

        }
    }
}
