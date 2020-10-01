package exp3;

public class Product extends Thread{
	
	private Buffer bf;
	private String name;
	public Product(Buffer bf,String name) {
		this.bf=bf;
		this.name=name;
		setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			bf.curri_req(Thread.currentThread().getName());
			try {
				Thread.sleep((long) (1000*Math.random()));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
