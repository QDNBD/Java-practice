
/**
 * 面试问题：
 *  *    Cloneable接口他是一个空接口，请问为什么呢？
 *  *    标记接口：
 *  *     Person implements Cloneable  认为Person
 *  *  *     将来可以被克隆
 * 1.implements Cloneable
 * 2.重写Object clone（）
 * 3.如果当前类包含了引用类型
 * person =》Money，在person 的clone方法内，不仅要克隆自己本身，还需要克隆money
 */
class Money implements Cloneable{
     double money = 12.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public String name;
    public Money m;
    public Person() {
        this.m = new Money();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person per = (Person) super.clone();
        per.m = (Money)this.m.clone();
        return per;
    }
}

public class TestDome2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person)person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("===============");
        person2.m.money = 99;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.name = "caocao";
        Person person1 = (Person) person.clone();
        person1.m.money = 99;
        System.out.println(person1.m);
        System.out.println(person.name);
    }
}
