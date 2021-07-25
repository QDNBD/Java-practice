 import java.util.*;
// class Foo {
//     public Semaphore seam_first_two = new Semaphore(0);

//     public Semaphore seam_two_second = new Semaphore(0);

//     public Foo() {
        
//     }

//     public void first(Runnable printFirst) throws InterruptedException {
        
//         // printFirst.run() outputs "first". Do not change or remove this line.
//         printFirst.run();
//         seam_first_two.release();
//     }

//     public void second(Runnable printSecond) throws InterruptedException {
        
//         // printSecond.run() outputs "second". Do not change or remove this line.
//         seam_first_two.acquire();
//         printSecond.run();
//         seam_two_second.release();
//     }

//     public void third(Runnable printThird) throws InterruptedException {
        
//         // printThird.run() outputs "third". Do not change or remove this line.
//         seam_two_second.acquire();
//         printThird.run();
//     }
// }


//既然都volatile的flag了，直接下面这么写
class Foo {
    private volatile int flag = 1; // volatile用来保证可见性
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        while (flag != 1) {
            
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag = 2;
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (flag != 2) {
            
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flag = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (flag != 3) {
            
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}