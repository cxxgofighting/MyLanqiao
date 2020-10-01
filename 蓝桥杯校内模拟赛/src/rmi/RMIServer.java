package rmi;


import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

public class RMIServer {
	public static void main(String args[]) {
		try {
			RemoteInterface remoteObj2 = new RemoteImpl();// ����Զ�̶���
			Context namingContext = new InitialContext();// ��ʼ����������
			LocateRegistry.createRegistry(8892);// �ڱ��������ϴ����͵���ע���ʵ��������ָ���Ķ˿��Ͻ�������
			namingContext.rebind("rmi://localhost:8892/RemoteObj2", remoteObj2);// ע����󣬼��Ѷ�����һ�����ְ󶨡�
			System.out.println("����RMIע����һ��Զ�̶���");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}