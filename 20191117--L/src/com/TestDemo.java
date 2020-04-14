package com;

public class TestDemo {
    class Base {
        Base() {
            System.out.println("Base");
        }
        public void func() {
            System.out.println("func");
        }
    }
    class Drieve extends Base{
        Drieve() {
            System.out.println("Drieve");
            super.func();
        }
    }
    class HelloA {
        public HelloA() {
            System.out.println("HelloA");
        }
        {
            System.out.println("i am A class");
        }
        static {
            System.out.println("static A");
        }
    }
    public class Text extends HelloA{
        public Text() {
            System.out.println("TestClass");
        }
        {
            System.out.println("i am  TestClass");
        }
        static {
            System.out.println("static TestClass");
        }
        public static void main(String[] args) {
            new TestDemo();
        }
    }

}
