import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        //   return this.age - o.age;
        return this.name.compareTo(o.name);
    }

}

class Person1{
    public String name;
    public int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class ComparatorByAge implements Comparator<Person1> {

    @Override
    public int compare(Person1 o1,Person1 o2) {
        if (o1 ==o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null){
            return 1;
        }
        return o1.age - o2.age;
    }
}

class ComparatorByname implements Comparator<Person1> {
    @Override
    public int compare (Person1 o1,Person1 o2) {
        if (o1 ==o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null){
            return 1;
        }
        return o1.name.compareTo(o2.name);
    }
}

public class Card {
    public int rank; // 数值
    public String suit; // 花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Person1[] people = new Person1[3];
        people[0] = new Person1("sffs",45);
        people[1] = new Person1("fdggrfd",444);
        people[2] = new Person1("vdv",25);

        ComparatorByAge comparatorByAge = new ComparatorByAge();
        Arrays.sort(people,comparatorByAge);
        ComparatorByname comparatorByname = new ComparatorByname();
        Arrays.sort(people,comparatorByname);

        System.out.println(Arrays.toString(people));
    }

    public static void main2(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("sffs",45);
        people[1] = new Person("fdggrfd",444);
        people[2] = new Person("vdv",25);

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }

    public static void main1(String[] args) {

        Card p = new Card(1, "♠");
        Card q = new Card(1, "♠");

        System.out.println(q == p);
        System.out.println(p.equals(q));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return rank == card.rank && suit.equals(card.suit);
    }

}