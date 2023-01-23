package linkcode.shop.user.controller;

public class Bill {
	
	private double prodId;
	private double total;
	private double cgst;
	private double sgst;
	private double finaltotal;
	Bill(double prodId, double total, double cgst, double sgst, double finaltotal) {
		super();
		this.prodId = prodId;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finaltotal = finaltotal;
	}
	public double getProdId() {
		return prodId;
	}
	public void setProdId(double prodId) {
		this.prodId = prodId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinaltotal() {
		return finaltotal;
	}
	public void setFinaltotal(double finaltotal) {
		this.finaltotal = finaltotal;
	}
	
    
}
