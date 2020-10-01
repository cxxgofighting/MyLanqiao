package exp3;

public class Demo {
	public static void main(String[] args) {
		Print p=new Print();
		Thread1 t1=new Thread1(p);
		Thread2 t2=new Thread2(p);
		Thread3 t3=new Thread3(p);
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		/*new Thread(new Thread1(p)).start();
		new Thread(new Thread2(p)).start();
		new Thread(new Thread3(p)).start();*/
	}
}
