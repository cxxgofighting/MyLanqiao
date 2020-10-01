package rmi;

public class OrderService {
	public String  orderService() {
		return new Data().getOrder();
	}
}
