
package com.example.geektrust.check_in;
import com.example.geektrust.passenger_type.Calculate;
import com.example.geektrust.passenger_type.Passenger;
import com.example.geektrust.station.Airport_Station;
import com.example.geektrust.station.Central_Station;
import com.example.geektrust.station.Station;

public class Check_IN {
	
	private String PASSENGER_TYPE;
	private String FROM_STATION;
	private String METRO_CARD_NUMBER;
	
	public Check_IN(String pASSENGER_TYPE, String fROM_STATION, String mETRO_CARD_NUMBER) {
		PASSENGER_TYPE = pASSENGER_TYPE;
		FROM_STATION = fROM_STATION;
		METRO_CARD_NUMBER = mETRO_CARD_NUMBER;
		
	}

	public void Metro_Card_Check() {
		
		
		Passenger pas=new Calculate();
		Integer bill =pas.Find_Fare_According_To_Passenger_Type(PASSENGER_TYPE, METRO_CARD_NUMBER);
		
		
		System.out.println("Bill "+bill);
		System.out.println("********************");
		
		if(FROM_STATION.equalsIgnoreCase("AIRPORT")) {
			
			Station airport_station=new Airport_Station();
			
			
		}else {
			
			Station central_station=new Central_Station();
			
			
		}
	}
	

	
	
	
}
