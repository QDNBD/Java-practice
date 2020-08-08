import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println(scan.hasNextLine());
            scan.nextLine();
        }
    }
}
