import java.io.File;

public class FileDamo {

    public static void main(String[] args) {


    {
        String path = "E:\\Java\\20200320";
        File dir = new File(path);
         File[] files = dir.listFiles();
         if (files != null) {
             for (File file : files) {
                 System.out.println(file.getName());
             }
         }
    }
    }
}
