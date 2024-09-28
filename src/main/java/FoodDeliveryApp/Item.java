package FoodDeliveryApp;

import java.util.*;

public class Item extends Hotel{

	String[] items = {"Tikka","Chicken65","Biriyani","Kabab","Grill"};
	int[] priceperqty = {249,160,270,220,420}; 
	String itemname,item;
	Double totalprice,quantity;
	Scanner sc = new Scanner(System .in);
	String hotelname = getHotelName();
	
	public Double GetQuantity()
	{
		System.out.println("Enter the quantity");
		quantity = sc.nextDouble();
		return quantity;
	}
	
	public String GetItem()
	{
		for(int i = 0;i<HotelName.length;i++)
		{	
			
			
			if(HotelName[i].equals(hotelname))
			{
				for(int j=0;j<items.length;j++)
				{	
				System.out.println(items[j]);
				}
		
				System.out.println("Select the item");
				itemname = sc.next();
			}
			
			
			
		}
		
		for(int j = 0;j<items.length;j++)
		{	
			if(items[j].equals(itemname))
			{
				item =  itemname;
			}
			
		}
		return item;
	}
	
		public Double PriceCalculation()
		{
				switch(itemname)
				{
					case "Tikka":
						totalprice= priceperqty[0]*GetQuantity();
						break;
					case "Chicken65":
						totalprice= priceperqty[1]*GetQuantity();
						break;
					case "Biriyani":
						totalprice= priceperqty[2]*GetQuantity();
						break;
					case "Kabab":
						totalprice= priceperqty[3]*GetQuantity();
						break;
					case "Grill":
						totalprice= priceperqty[4]*GetQuantity();
						break;
				}
		
				return totalprice;	
		}
}
