package exp3;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random r=new Random();
		String []curs= {"英语社会国家入门","影视欣赏","英文经典阅读",
				"红楼梦","插花与压花","女大学生礼仪","上大学，不迷茫",
				"流行音乐鉴赏","中国古典小说欣赏","音乐审美与心理健康"};
		Buffer bf=new Buffer();
		String cur1=curs[r.nextInt(curs.length)];
		String cur2=curs[r.nextInt(curs.length)];
		String cur3=curs[r.nextInt(curs.length)];
		
		Product p=new Product(bf,cur1);
		p.start();
		Product p1=new Product(bf,cur2);
		p1.start();
		Product p2=new Product(bf,cur3);
		p2.start();
		Customer c1=new Customer(bf,cur1);
		c1.start();
		Customer c2=new Customer(bf,cur2);
		c2.start();
		Customer c3=new Customer(bf,cur3);
		c3.start();
	}
}
