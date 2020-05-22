import java.util.*;

class Person {
    public String name;
    public String Class;
    public double score;

    public  Person(String name,String Class,double score){
        this.name = name;
        this.Class = Class;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                ", score=" + score +
                '}';
    }
}

public class TestDamo1 {
    public static List<Character> func(String str1,String str2) {
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(i);
            if (!str2.contains(temp + "")) {
                ret.add(temp);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 ="come";
        List<Character> ret = func(str1,str2);
        System.out.println(ret.toString());
    }
    public static void main1(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("zhangfei","20班",88));
        list.add(new Person("caocao","20班",38));
        list.add(new Person("guanyu","20班",78));
        System.out.println(list);
        for (Person person:list){
            System.out.println(person);
        }
//        Collection.sort(list);
//        System.out.println(list);
    }
}
