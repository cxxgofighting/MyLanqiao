package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//远程用户服务
public class AccountService extends UnicastRemoteObject{

	protected AccountService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String accountService() throws RemoteException{
		return new Data().getAccount();
	}

}
