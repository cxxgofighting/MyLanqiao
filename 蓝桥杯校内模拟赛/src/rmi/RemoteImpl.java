package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//ģ�����ġ�΢�š�����
public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface{
	// ��ΪUnicastRemoteObject�Ĺ��췽���׳���RemoteException�쳣���������Ĭ�ϵĹ��췽������д��
		// ���������׳�RemoteException�쳣
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

		// ʵ��doSomething����
		public String doSomething() throws RemoteException {
			return "����Զ�̶�����з���";
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