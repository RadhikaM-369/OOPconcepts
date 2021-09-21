package com.xworkz.OOPconcepts;

public class SimCard {
	int price;
	String nameOfTheNetwork;
	int No_of_subscribers;
	int NoOfSimCardsAvaible;
	String typeOfSimcard;
	String plans;
	String nameOfSubscriber;
	long adharNo;
	
	public void purchage() {
		System.out.println("start subscription ");
	}
	public void changePlan() {
		System.out.println("Change current plan");
	}
		public void port() {
		System.out.println("Change to another network ");
	}
	
}
