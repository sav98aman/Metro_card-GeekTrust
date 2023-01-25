package com.example.geektrust.passenger_type;



public interface Passenger{
	
	public Integer Find_Fare_According_To_Passenger_Type(String type,String Metro_Card_Number) ;
	public Integer Make_Payment_Card(String Metro_Card_Number,Integer fare);
}
