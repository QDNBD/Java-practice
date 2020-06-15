public class A<T> {

        T value;



        A(T value) {

            this.value = value;

        }



        T get() {

            return value;

        }


    public static void main(String[] args) {
        A<Integer> a = new A<>(2);
        a.this.value(3);
        a.get();
    }
}
