package p2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collection;


public class MainClass {


	public static void filterlist(List<ElectronicDevice> List, Map<String,List<ElectronicDevice>> mapList) {
		
		System.out.println("\nSorting Type");
		System.out.println("1.By Price\t2By Ratings");
		System.out.println("Enter Type ?? ");
		
		int choice = new Scanner(System.in).nextInt();

		switch(choice) {
			case 1:
				Collections.sort(List,new PriceSorted());
				break;
			case 2:
				Collections.sort(List,new RatingSorted());
				break;
			default: System.out.println("Wrong Input !!");
						System.exit(0);
			}
		Iterator<String> itr = mapList.keySet().iterator();
		
		while(itr.hasNext()) {
			String Key = itr.next();
			if(Key.equalsIgnoreCase("Computer"))
			{
				List<ElectronicDevice> result = mapList.get(Key);
				
				for (ElectronicDevice electronicDevice : result) {
					if(electronicDevice.getPrice() >=40000 && electronicDevice.getPrice()<=200000) {
						System.out.println(electronicDevice);
					}
				}
				
			}
			
			else if(Key.equalsIgnoreCase("Mobile Phone"))
			{
				List<ElectronicDevice> result = mapList.get(Key);
				
				for (ElectronicDevice electronicDevice : result) {
					if(electronicDevice.getPrice() >=1500 && electronicDevice.getPrice()<=100000) {
						System.out.println(electronicDevice);
					}
				}	
			}
			
			else if(Key.equalsIgnoreCase("Camera"))
			{
				List<ElectronicDevice> result = mapList.get(Key);
				
				for (ElectronicDevice electronicDevice : result) {
					if(electronicDevice.getPrice() >=50000 && electronicDevice.getPrice()<=80000) {
						System.out.println(electronicDevice);
					}
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		int sel;
		MainClass obj = new MainClass();
		Memory SD  = new Memory("SanDisk",64);
		Bluetooth BT5 = new Bluetooth(5.2);
		Bluetooth BT4 = new Bluetooth(4.0);
		
		do{
//==============================================================================================================
			
			MobilePhone M1 = new MobilePhone("Samsung",400,2,20000,SD,BT4);
			MobilePhone M2 = new MobilePhone("lenovo",200,7,38000,SD,BT4);
			MobilePhone M3 = new MobilePhone("sony",270,2,40000,SD,BT5);
			MobilePhone M4 = new MobilePhone("iphone",900,3,42000,SD,BT5);
			
			
			Map<String,List<ElectronicDevice>> ElectronicdevicesList = new LinkedHashMap<>();
			
			List<ElectronicDevice> MobileList = new ArrayList<>();
			
			MobileList.add(M1);
			MobileList.add(M2);
			MobileList.add(M3);
			MobileList.add(M4);
			
			
//===============================================================================================================
			
			Computer L1= new Computer("HP",3000,8,40000,SD,BT4);
			Computer L2= new Computer("Apple",700,7,190000,SD,BT5);
			Computer L3= new Computer("Apple",300,9,70000,SD,BT5);
			Computer L4= new Computer("Dell",900,7,193000,SD,BT5);
			
			
			List<ElectronicDevice> CompList = new ArrayList<>();
			
			CompList.add(L1);
			CompList.add(L2);
			CompList.add(L3);
			CompList.add(L4);
		
//===============================================================================================================	
			
			Camera C1=new Camera("Nikon",500,7,50000,SD,BT4);
			Camera C2=new Camera("Canon",300,8,30000,SD,BT5);
			Camera C3=new Camera("HassleBlad",900,9,10000,SD,BT5);
			Camera C4=new Camera("Sony",500,8,24000,SD,BT5);
			
			List<ElectronicDevice> CamList = new ArrayList<>();
			
			CamList.add(C1);
			CamList.add(C2);
			CamList.add(C3);
			CamList.add(C4);
			
//==============================================================================================================
			
			System.out.println("\nSELECT A DEVICE");
			System.out.println("\n1.Computer");
			System.out.println("\n2.Mobile Phones");
			System.out.println("\n3.Camera");
			System.out.println("\nWhich Device you want ??\n");
			
			int device = new Scanner(System.in).nextInt();
			
			switch (device) {
			case 1: 
				ElectronicdevicesList.put("Computer", CompList);
				filterlist(CompList,ElectronicdevicesList);
				break;
			case 2: 
				ElectronicdevicesList.put("Mobile Phone", MobileList);
				filterlist(MobileList,ElectronicdevicesList);
				break;
			case 3: 
				ElectronicdevicesList.put("Camera", CamList);
				filterlist(CamList,ElectronicdevicesList);
				break;
			default: System.out.println("Invalid Choice!!!");

		}
		
		System.out.println(" Press 1 else 0");
		sel = new Scanner(System.in).nextInt();

	}while(sel == 1);

	}
}
