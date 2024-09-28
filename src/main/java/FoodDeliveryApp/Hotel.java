package FoodDeliveryApp;
import java.util.*;

public class Hotel {
	Scanner sc = new Scanner(System.in);
	String[] HotelName = {"A2B","SB","Rasavid","SS","Khalids"};
	String hotelname;
	
	public String getHotelName()
	{
		
		System.out.println("HotelName");
		for(int i=0;i<HotelName.length;i++)
		{
			System.out.println(HotelName[i]);
		}
		System.out.println("Enter valid hotel Name:");
		hotelname = sc.nextLine();
		return hotelname;
	}
	
}
