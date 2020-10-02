
import java.util.*;
public  class  text {

}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = scan.nextInt();
            int ask = scan.nextInt();
            HashMap<String,Integer> map = new HashMap<>();
            while(n-- > 0) {
                map.put(scan.nextLine(), scan.nextInt());
            }
            List<Map.Entry<String, Integer>> infoIds =
                    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

//排序前
            for (int i = 0; i < infoIds.size(); i++) {
                String id = infoIds.get(i).toString();
            }


            //排序
            if(ask == 0) {
                Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue() - o1.getValue());
                        //return (o1.getKey()).toString().compareTo(o2.getKey());
                    }
                });
            }else{
                Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o1.getValue() - o2.getValue());
                        //return (o1.getKey()).toString().compareTo(o2.getKey());
                    }
                });
            }
            //排序后
            for (int i = 0; i < infoIds.size(); i++) {
                String id = infoIds.get(i).toString();
                System.out.println(id);
            }


        }
    }
}