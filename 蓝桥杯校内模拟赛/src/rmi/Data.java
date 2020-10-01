package rmi;

public class Data {
	String account="使用了远程用户服务！";
	String goods="使用了远程商品服务！";
	String order="使用了远程订单服务！";
	String sale="使用了远程销售服务！";
	public String getAccount() {
		return this.account;
	}
	public String getGoods() {
		return this.goods;
	}
	public String getOrder() {
		return this.order;
	}
	public String getSale() {
		return this.sale;
	}
}
