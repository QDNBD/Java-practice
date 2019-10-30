import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main1(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2,4));
        System.out.println(calculator.sub(23,5));
        System.out.println(calculator.mol(2,5));
        System.out.println(calculator.div(20,5));
    }

    public static void main2(String[] args) {
        Person person1 = new Person("张三","男",18);
        person1.personshow();
        Person person2 = new Person("李四","男",22);
        person2.personshow();

        person1.eat();
        person1.learn();
        person2.sleep();
    }

    public static void main(String[] args) {
        Change change1 = new Change(33,53);
        change1.change();
    }


}
