package com.example.geektrust.passenger_type;

import java.util.HashMap;

import com.example.geektrust.Balance.Balance_Metro_Card;

public class Calculate implements Passenger{
	
	private static HashMap<String , Integer> Passenger_Type_Count_Map=new HashMap<>();
	
	private static HashMap<String , Integer> Passenger_Discount_Map=new HashMap<>();
	
	public void Count_Passenger(String type) {
		if( Passenger_Type_Count_Map.containsKey(type) ) {
			Integer pre_count=Passenger_Type_Count_Map.get(type);
			//updating by one 
			Passenger_Type_Count_Map.put(type, (pre_count+1));
		}else {
			Passenger_Type_Count_Map.put(type, 1);
		}
		
	}
	@Override
	public Integer Find_Fare_According_To_Passenger_Type(String type , String Metro_Card_Number) {
		
		Count_Passenger(type);//Update Count According to Passenger
		
		boolean check_Discount=Check_Passenger_Discount(Metro_Card_Number);//discount::
		
//		System.out.println("Discount "+ check_Discount);
		
		int res=0;
		
		if(type.equalsIgnoreCase("ADULT")) {
			
			res+=200;
		}else if(type.equalsIgnoreCase("KID")){
			res+= 50;
		}else {
			res+= 100;
		}
		if(check_Discount) {
			return res/2;
		}else
		return res;
		
		
	}
//	@Override
	public boolean Check_Passenger_Discount(String Metro_Card_Number) {
		
		if(Passenger_Discount_Map.containsKey(Metro_Card_Number)) {
			
			Integer flag=Passenger_Discount_Map.get(Metro_Card_Number);
			if(flag==1) {
				//set next time no Discount set 1 to 0
				Passenger_Discount_Map.put(Metro_Card_Number, 0);
				//get-Discount 1---mens get discount beacuse 2nd time jourany
				return true;
				
			}else {
				//this time no discount 0--first time
				Passenger_Discount_Map.put(Metro_Card_Number, 1);
				return false;
			}
		}else {
			Passenger_Discount_Map.put(Metro_Card_Number, 1);
			return false;
		}
		
	}
	
	@Override
	public Integer Make_Payment_Card(String Metro_Card_Number, Integer fare) {

		Balance_Metro_Card metro_card_map=new Balance_Metro_Card();
		HashMap<String, Integer> Metro_Card_Info=metro_card_map.getMETRO_CARD_NUMBER_AND_BALANCE();
		return null;
	}
	
	
	
	
	
}
