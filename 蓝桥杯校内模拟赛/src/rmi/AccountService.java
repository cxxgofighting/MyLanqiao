package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Զ���û�����
public class AccountService extends UnicastRemoteObject{

	protected AccountService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String accountService() throws RemoteException{
		return new Data().getAccount();
	}

}
