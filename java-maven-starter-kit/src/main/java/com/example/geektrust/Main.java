package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import com.example.geektrust.Balance.Balance_Metro_Card;
import com.example.geektrust.check_in.Check_IN;

public class Main {
    public static void main(String[] args) {
        
    	try {
            
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            while (sc.hasNextLine()) {
            	String inputCommand = sc.nextLine();
            	System.out.println(inputCommand);
            	String[] input=inputCommand.trim().split(" ");
            	
            	if(input[0].equalsIgnoreCase("BALANCE")) {
            		
            		Balance_Metro_Card metro_card=new Balance_Metro_Card(input[1],Integer.parseInt(input[2]));
            		metro_card.Update_Metro_Card_Balance();//add Balance card and balanced
            		
            		
            	}
            	if(input[0].equalsIgnoreCase("CHECK_IN")) {
            		
            		String Card_Number=input[1];
            		String Type=input[2];
            		String satation=input[3];
            		
            		Check_IN ch=new Check_IN(Type, satation, Card_Number);
            		
            		ch.Metro_Card_Check();
            		
            		
            	}
            	if(input[0].equalsIgnoreCase("PRINT_SUMMARY")) {
            		Balance_Metro_Card card=new Balance_Metro_Card();
            		System.out.println(card.getMETRO_CARD_NUMBER_AND_BALANCE());
            		
            	}
            	
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        	System.err.println(e.getMessage());
        }
        
    }
}
