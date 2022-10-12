package model;


import java.util.LinkedHashMap;

public class OrderedFood {
	//<orderid,<food_name,price per quantity>>
	private LinkedHashMap<Integer,LinkedHashMap<String,Double>> order_list;
	
	
	public void insert_ordered_food(String food_name,Double price_per_quantity)
	{
		order_list.get(OrderDetails.bill_id).put(food_name, price_per_quantity);
	}
	
}
