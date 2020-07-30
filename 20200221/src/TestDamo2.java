import java.util.Objects;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //如果要往哈希表当中存放自定义类型
    //必须重写equals和hashCode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class HashBack2<K,V> {
            static class Node<K,V>{
            private K key;
            private V value;
            private Node<K,V> next;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private Node<K,V>[] array = (Node<K, V>[]) new  Node[8];//存放单链表的头结点
        private int size;//当前数据的个数

        public V getValue(K key) {
            int hashCode = key.hashCode();
            int index = hashCode % array.length;

            Node<K,V> head = array[index];
            for (Node<K,V> cur = head;cur != null;cur = cur.next){
                if (cur.key.equals(key)) {
                    return cur.value;
                }
            }
            return null;
        }

        public void put(K key,V value) {
            int hashCode = key.hashCode();
            int index = hashCode % array.length;

            for (Node cur = array[index]; cur != null; cur = cur.next)  {
                if (cur.key == key) {
                    cur.value = value;
                    return;
                }
            }

            //头插
            Node<K,V> node = (Node<K,V>)new Node(key,value);
            node.next = array[index];
            array[index] = node;
            this.size++;
        }

    }








public class TestDamo2 {
    public static void main(String[] args) {
        Person person1 = new Person("jjk",33);
        Person person2 = new Person("jjk",33);

        HashBack2<Person,String> hashBucket2 = new HashBack2<>();
        hashBucket2.put(person1,"34343");


        String id = hashBucket2.getValue(person2);
        System.out.println(id);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
