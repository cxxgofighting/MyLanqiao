package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//模拟具体的“微信”门面
public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface{
	// 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，因此这里默认的构造方法必须写，
		// 必须声明抛出RemoteException异常
	    AccountService accountService;
	    GoodsServerice goodsServerice;
	    OrderService  orderService;
	    SaleService saleService;
	    
		public RemoteImpl() throws RemoteException {
			accountService = new AccountService();
			goodsServerice = new GoodsServerice();
			orderService = new OrderService();
			saleService = new SaleService();
		}

		// 实现doSomething方法
		public String doSomething() throws RemoteException {
			return "调用远程对象进行服务：";
		}

		@Override
		public String account() throws RemoteException {
			// TODO Auto-generated method stub
			return accountService.accountService();
		}

		@Override
		public String goods() throws RemoteException {
			// TODO Auto-generated method stub
			return goodsServerice.goodsServerice();
		}

		@Override
		public String order() throws RemoteException {
			// TODO Auto-generated method stub
			return orderService.orderService();
		}

		@Override
		public String sale() throws RemoteException {
			// TODO Auto-generated method stub
			return saleService.saleService();
		}

}