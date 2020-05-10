package com;

class Animal{
    public String name;
    public Animal(String name){
        this.name = name;
        eat();
    }
    public void eat() {
        System.out.println(this.name + "Animal : eat");
    }
}

class Cat extends Animal{
    public String sex;
    public Cat(String name,String sex){
        super(name);
        this.sex = sex;
    }
    public void jump() {
        System.out.println(this.name + "jump");
    }

}

class Brid extends Animal{
    public Brid(String name){
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "fly");
    }

   /* @Override
    public void eat() {
        super.eat();
    }*/
}

public class TestDemo1 {
    public static void main(String[] args) {
        Animal animal = new Cat("小明","man");
//        animal.eat();

        //向下转型
        Animal animal2 = new Brid("小花");
//        animal2.eat();
        ((Brid) animal2).fly();
    }

}
