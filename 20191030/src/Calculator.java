class Calculator {
      private  int num1;
      private  int num2;

      public int add(int num1,int num2) {
           this.num1 = num1;
           this.num2 = num2;
          return  this.num1 + this.num2;
      }
      public int sub(int num1,int num2) {
          this.num1 = num1;
          this.num2 = num2;
          return this.num1 - this.num2;
      }

      public int mol(int num1,int num2) {
          this.num1 = num1;
          this.num2 = num2;
          return this.num1 * this.num2;
      }

      public int div(int num1,int num2) {
          this.num1 = num1;
          this.num2 = num2;
          return this.num1 / this.num2;
      }

}

class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void learn() {
        System.out.println("learn()");
        System.out.println("学习");
    }

    public void eat() {
        System.out.println("eat()");
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("sleep()");
        System.out.println("睡觉");
    }

    public void personshow() {
        System.out.println("我的名字是" + name + "性别" + sex + "年龄" + age);
    }
}

class Change {
    private  int num1;
    private  int num2;

    public Change(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void change() {
        System.out.println("num1 " + num1 + "  num2 " + num2);
        int temp = this.num1;
        this.num1 = this.num2;
        this.num2 = temp;
        System.out.println("num1 " + num1 + "  num2 " + num2);
    }
}