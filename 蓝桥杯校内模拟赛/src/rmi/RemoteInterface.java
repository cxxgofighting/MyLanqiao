package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//远程移动设备facade接口
public interface RemoteInterface extends Remote{
	// 声明一个doSomething方法
		public String doSomething() throws RemoteException;
		public String account() throws RemoteException;
		
		public String goods() throws RemoteException;
		
		public String order() throws RemoteException;
		
		public String sale() throws RemoteException;
}

