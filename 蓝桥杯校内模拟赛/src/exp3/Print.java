package exp3;

public class Print {
	private int a=1;
	public Print() {}
	public synchronized void printA(){
		while(a!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"A");
		a=2;
		notifyAll();
	}
	public synchronized void printB(){
		while(a!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"B");
		a=3;
		notifyAll();
	}
	public synchronized void printC(){
		while(a!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"C");
		a=1;
		notifyAll();
	}
}
