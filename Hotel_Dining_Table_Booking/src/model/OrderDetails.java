package model;

public class OrderDetails {
	public static int bill_id=1000;
	
	
	private String customer_id;
	private int selected_table;
	private double bill_amount;
	
	
	
	
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public int getSelected_table() {
		return selected_table;
	}
	public void setSelected_table(int selected_table) {
		this.selected_table = selected_table;
	}
	public double getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(double bill_amount) {
		this.bill_amount = bill_amount;
	}
	
	
}
