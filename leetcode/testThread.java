public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "run() 方法正在执行...");
	}
}

public class TheadTest {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println(Thread.currentThread().getName() + "main() 方法执行结束...");
	}
}

//运行结果
//main main()方法执行结束
//Thread-0 run()方法正在执行...


public class MyRunnable implements Runnable {
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + "run()方法正在执行...");
	}
}

public class RunnableTest {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		System.out.println(Thread.currentThread().getName() + "main()方法执行结束...");
	}
}

//运行结果
//main main()方法执行完成
//Thread-0 run()方法执行中...



//实现Callable接口
//（1）创建实现Callable接口的类MyCallable；
//（2）以MyCallable类的实例为参数创建FutureTask对象；
//（3）将FutureTask对象作为参数创建Thread对象；
//（4）调用线程对象的 start() 方法；

public class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() {
		System.out.println(Thread.currentThread().getName() + "call()方法执行中...");
		return 1;
	}
}

public class CallableTest {
	public static void main(String[] args) {
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
		Thread thread = new Thread(futureTask);
		thread.start();
		
		try {
			Thread.sleep(1000);
			System.out.println("返回结果" + futureTask.get());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "main()方法执行完成");
	}
}

//Thread-0 call()方法执行中...
//返回结果 1
//main main()方法执行完成
			
