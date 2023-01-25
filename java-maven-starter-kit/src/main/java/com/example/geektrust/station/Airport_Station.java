package com.example.geektrust.station;




public class Airport_Station implements Station {
	private static Integer Total_Airport_Collection=0;
	private static Integer Total_Discount_By_Airport=0;

	@Override
	public Integer Total_Station_Amount_Collection(Integer fare_charge_amount) {
		// TODO Auto-generated method stub
		Total_Airport_Collection+=fare_charge_amount;
		return Total_Airport_Collection;
	}

	@Override
	public Integer Total_Discount_By_Station(Integer dicount_amount) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
