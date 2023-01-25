package com.example.geektrust.station;


public class Central_Station implements Station{
	private static Integer Total_Central_Collection=0;
	private static Integer Total_Discount_By_Central=0;
	
	@Override
	public Integer Total_Station_Amount_Collection(Integer fare_charge_amount) {
		Total_Central_Collection+=fare_charge_amount;
		return Total_Central_Collection;
	}

	@Override
	public Integer Total_Discount_By_Station(Integer dicount_amount) {
		Total_Discount_By_Central+=dicount_amount;
		return Total_Discount_By_Central;
	}

	

}
