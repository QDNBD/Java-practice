public class test {


    private static int sum(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,3));
        Student student = new Student();
        Student.func1();
        student.eat();
        System.out.println(Student.count);
        Student student1 = new Student();
        student1.eat();
        System.out.println(student1.name.length());
    }




    public static void main1(String[] args) {
        //实例化一个对象
       // Student student = new Student();
        Student.count++;
        System.out.println(Student.count);
        Student.count++;
        System.out.println(Student.count);

    }
}