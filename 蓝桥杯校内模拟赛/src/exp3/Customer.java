package exp3;

public class Customer extends Thread{
	private Buffer bf;
	private String name;
	public Customer(Buffer bf,String name) {
		this.bf = bf;
		this.name=name;
		setName(name);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			bf.data_req();
			try {
				Thread.sleep((long) (1000*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
