package javatuning.ch2.bd;

import java.rmi.Naming;

import javatuning.ch2.vo.Order;

public class Client {
	public static void main(String[] argv) {
		try {
			IOrderManager usermanager = (IOrderManager) Naming
					.lookup("OrderManager");
			if (usermanager.checkUser(1)) {
				Order o = usermanager.getOrder(1);
				o.setNumber(10);
				usermanager.updateOrder(o);
			}
		} catch (Exception e) {
			System.out.println("OrderManager exception: " + e);
		}
	}
}
