
package FoodDeliveryApp;


public class TaxAndDiscounts extends Item {
	
	double finalamount,discount,total;
	double qty;
	double totalprice;
	String item = GetItem();
	
	public double TaxCalculation() 
	{
		totalprice = PriceCalculation();
		Double tax = totalprice*0.18;
		finalamount =  totalprice + tax ;
		return tax;
	}
	
	public double DiscountCalculation()
	{
		if(finalamount>500)
		{
			discount = finalamount *0.10;
		}
		
		total = finalamount - discount;
		return total;
	}
	
	public void printbill()
	{
		
		
		//System.out.println("Quantity :" + GetQuantity());
		System.out.println("*** " +hotelname+ " ***");
		System.out.println("Item         : " + item);
		System.out.println("Tax          : " + TaxCalculation());
		System.out.println("Total Amount : " + DiscountCalculation());
		
	}

}
