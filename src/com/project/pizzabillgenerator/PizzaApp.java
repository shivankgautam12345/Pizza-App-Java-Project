package com.project.pizzabillgenerator;

public class PizzaApp {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
         Pizza basepizza = new Pizza(true);
         basepizza.addExtraToppings();
         basepizza.addExtraCheese();
         basepizza.takeaway();
         basepizza.getBill();
		
	    DeluxPizza dp = new DeluxPizza(false);
	   	dp.addExtraCheese();
		dp.addExtraToppings();
	    dp.takeaway();
		dp.getBill();
         
	}

}

