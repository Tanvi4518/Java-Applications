package linkcode.shop.admin.model;

public class Product {
	
	private int prodId;
	private String prodNm;
	private double prodPrice;
	private int prodQty;
	public Product(int prodId, String prodNm, double prodPrice, int prodQty) {
		super();
		this.prodId = prodId;
		this.prodNm = prodNm;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdNm() {
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		this.prodNm = prodNm;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	

}
