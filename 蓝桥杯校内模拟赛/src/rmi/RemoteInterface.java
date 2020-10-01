package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Զ���ƶ��豸facade�ӿ�
public interface RemoteInterface extends Remote{
	// ����һ��doSomething����
		public String doSomething() throws RemoteException;
		public String account() throws RemoteException;
		
		public String goods() throws RemoteException;
		
		public String order() throws RemoteException;
		
		public String sale() throws RemoteException;
}

