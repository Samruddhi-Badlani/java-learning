import java.awt.List;

public class MyThread1 extends Thread {
	static int[] list = {1,2,3,4,5};
	
	
	@Override
	public void run() {
		System.out.print("Thread "+Thread.currentThread().getId()+" is running ");
		for(int i=0;i<list.length;i++) {
			list[i]= list[i]*2;
		}
		for(int i=0;i<list.length;i++) {
			System.out.println(Thread.currentThread().getId()+"  "+list[i]);
		}
	}
	
	public static void main(String[] args) {
		
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		thread1.start();
		thread2.start();
		
		for(int i=0;i<list.length;i++) {
			System.out.println(Thread.currentThread().getId()+"  "+list[i]);
		}
	}
}
