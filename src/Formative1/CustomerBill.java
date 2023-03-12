package Formative1;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerBill {
	
	public static void getBrands (HashMap<String, Double> hash) {
		//Loops through the keys of that HashMap input and numbers them for each iteration
		short i = 1;
		for (String brands : hash.keySet()) {
			  System.out.println(i+". "+brands+" Price: "+ hash.get(brands));
			i++;
		}
		System.out.println("0. Exit");
	}
	
	public static Double getPrice(HashMap<String, Double> hash, String brand){
		double price = hash.get(brand);
		return price;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String brand = null, color = null;
		Double price = null, gross = null, vat = null, net = null, pay, change;
		Integer  qty;
		
		System.out.println("Hello! Welcome to the phone store! \n"
						+  "Please choose a phone you want to buy:");
		
		HashMap<String, Double> phoneList = new HashMap<String, Double>();
		phoneList.put("Xiaomi",  20000.0);
		phoneList.put("Samsung", 30000.0);
		phoneList.put("Iphone",  80000.0);
		phoneList.put("Huawei",  25000.0);
		
		getBrands(phoneList);
		short choice = input.nextShort();
	
		switch (choice) {
		case 1:
			brand = "Xiaomi";
			price = getPrice(phoneList, brand);
			break;
		case 2:
			brand = "Samsung";
			break;
		case 3:
			brand = "Iphone";
			break;
		case 4:
			brand = "Huawei";
			break;
		default:
			break;
		}
		
		System.out.println("Please choose an available color for your phone!\n"
						 + "1. Black\n2. Red\n3. Blue");
		short choice2 = input.nextShort();
		
		switch (choice2) {
		case 1:
			color = "Black";
			break;
		case 2:
			color = "Red";
			break;
		case 3:
			color = "Blue";
			break;
		default:
			break;
		}
		
		System.out.println("Please input the quantity of the phone you want to buy:");
		 qty = input.nextInt();
		 gross = price * qty;
		 vat = 0.038*gross;
		 net = gross+vat;
		 
		 System.out.println("Brand     :"+brand+"\n"
		 			+   "Color     :"+color+"\n"
		 			+   "Price     :"+price+"\n"
		 			+   "Quantity  :"+qty+"\n\n"
		 			+   "Gross     :"+gross+"\n"
		 			+   "Vat (3.8%):"+vat+"\n"
		 			+   "Net Total :"+net);
		 System.out.println("Please input your payment:");
		 pay = input.nextDouble();
		 change = pay - net;
		 System.out.println("Payment :"+pay+"\n"
		 				  + "Change  :"+change);
		}
	}

