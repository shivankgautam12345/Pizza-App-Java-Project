package com.project.pizzabillgenerator;

public class Pizza {
private int price;
public Boolean veg;
private int extraCheesePrice = 100;
private int extraToppingsPrice = 150;
private int backPackPrice = 20;
private int basePizzaPrice;

private boolean isExtraCheeseAdded  = false;
private boolean isExtraToppingsAdded  = false;
private boolean isOptedForTakeAway = false;

public Pizza(Boolean veg) {
	super();
	this.veg = veg;

if(this.veg) {
	this.price = 300;	
}else {
	this.price = 400;
      }
basePizzaPrice = this.price;


}
public void addExtraCheese() {
	isExtraCheeseAdded = true;
	//System.out.println("Extra cheese added");
    this.price+=extraCheesePrice;
}
public void addExtraToppings() {
	isExtraToppingsAdded = true;
	System.out.println("Pizza: "+this.price);
	this.price+= extraToppingsPrice;
}
public void takeaway() {
	isOptedForTakeAway = true;
	//System.out.println("Take away opted");
	this.price+= backPackPrice;
}
public void getBill() {
	String bill = "";
	//System.out.println("Pizza: "+ basePizzaPrice);
    if(isExtraCheeseAdded) {
    	bill+= "Extra Cheese added "+ extraCheesePrice+ "\n";
    }
    if(isExtraToppingsAdded) {
    	bill+= "Extra Toppings added "+ extraToppingsPrice+ "\n";
    }
    if(isOptedForTakeAway) {
    	bill+= "Take Away "+ backPackPrice+ "\n";
    }
    bill += "Bill: "+this.price + "\n";
   System.out.println(bill);
    	
    	
    }


}

