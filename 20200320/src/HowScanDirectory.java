import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class HowScanDirectory {
    public static void main(String[] args) {
        File root = new File("E:\\Java\\20200320");
        travelDepth(root);
        System.out.println("==========");
        travelBroad(root);


    }

    private static void travelBroad(File root) {
        Queue<File> queue = new LinkedList<>();
         queue.add(root);

         while (!queue.isEmpty()) {
             File front = queue.remove();
             System.out.println(front.getAbsoluteFile());
             if (front.isDirectory()) {
                 File[] files = front.listFiles();
                 if (files != null) {
                     for (File file : files) {
                         queue.add(file);
                     }
                 }
             }
         }
    }

    private static void travelDepth(File node) {
        System.out.println(node.getAbsolutePath());
        //判断是不是叶子
        if (node.isDirectory()) {
            File[] files = node.listFiles();
            if (files != null) {
                for (File file : files) {
                    travelDepth(file);
                }
            }
        }
    }
}
