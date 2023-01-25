package com.example.geektrust.Balance;

import java.util.HashMap;


public class Balance_Metro_Card{
	
	private static HashMap<String, Integer> METRO_CARD_NUMBER_AND_BALANCE=new HashMap<>();
	
	private String METRO_CARD_NUMBER;
	private Integer BALANCE_IN_THE_METROCARD;
	
	
	public Balance_Metro_Card() {
		
	}


	public Balance_Metro_Card(String mETRO_CARD_NUMBER, Integer bALANCE_IN_THE_METROCARD) {
		METRO_CARD_NUMBER = mETRO_CARD_NUMBER;
		BALANCE_IN_THE_METROCARD = bALANCE_IN_THE_METROCARD;
		
	}
	public void Update_Metro_Card_Balance() {
		METRO_CARD_NUMBER_AND_BALANCE.put(METRO_CARD_NUMBER, BALANCE_IN_THE_METROCARD);
	}
	//get metro card and balance
	public static HashMap<String, Integer> getMETRO_CARD_NUMBER_AND_BALANCE() {
		return METRO_CARD_NUMBER_AND_BALANCE;
	}
	
	
	
}
