package exp3;

public class Thread2 implements Runnable{
	private Print p;
	public Thread2(Print p) {
		this.p=p;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {			
			p.printB();
		}
	}
}
