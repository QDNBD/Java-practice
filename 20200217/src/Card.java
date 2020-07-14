import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person>{
    private String name;
    private int age;

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
        //return this.age - o.age;
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
        return "Person1{" +
                "name='" + name + '\'' +
                ", agr=" + age +
                '}';
    }
}

class ComparatorByage implements Comparator<Person1> {
    @Override
    public int compare(Person1 o1, Person1 o2) {
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        if ((o1 == o2)) {
            return 0;
        }
        return o1.age - o2.age;
    }
}

class ComparatorByname implements Comparator<Person1> {
    @Override
    public int compare(Person1 o1, Person1 o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.name.compareTo(o2.name);

    }
}

public class Card {
    private String name;
    private int rank;

    public Card(String name, int rank) {
        this.name = name;
        this.rank = rank;
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
        return rank == card.rank && name == card.name;
    }

    public static void main(String[] args) {
        Person1[] person = new Person1[3];
        person[0] = new Person1("wang" ,23);
        person[1] = new Person1("lonf",45);
        person[2] = new Person1("ksdsd",70);

        ComparatorByage comparatorByage = new ComparatorByage();
        Arrays.sort(person,comparatorByage);

        ComparatorByname comparatorByname = new ComparatorByname();
        Arrays.sort(person,comparatorByname);

        System.out.println(Arrays.toString(person));
    }

    public static void main1(String[] args) {
        Card card = new Card("♠",1);
        Card card1 = new Card("♠",1);



        System.out.println(card == card1);
        System.out.println(card.equals(card1));
    }
}
