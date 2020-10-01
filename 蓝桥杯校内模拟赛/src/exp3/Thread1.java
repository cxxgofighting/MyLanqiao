package exp3;

public class Thread1 implements Runnable{
	private Print p;
	public Thread1(Print p) {
		this.p=p;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			p.printA();
		}
	}
}
