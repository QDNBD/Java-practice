import java.util.*;

public class TestDamo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("黑旋风","李逵");
        System.out.println(map);
        String str = map.getOrDefault("及时雨","小名");
        System.out.println(str);
        System.out.println(map.containsKey("黑旋风"));
        System.out.println("===== ");
        for (Map.Entry<String,String>entry : map.entrySet()){
            System.out.println(entry.getKey() + " ");
        }
    }

    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.add("hallo");
        collection.add("java");
        System.out.println(collection);
        collection.remove("java");
        System.out.println(collection);
        collection.add("2019");
        collection.add("1208");
        System.out.println(collection);
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
    }
}
