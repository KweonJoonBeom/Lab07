package edu.handong.csee.java.lab07.prob2;
import java.util.Scanner;

/**
 * this Chicken class have many of Chicken menus that is defined by user
 * if you want get the chicken's name and this price or peple's stars then try and use this program
 * 
 * @author °ÇÁØ¹ü
 *
 *
 */
public class Chicken {
	private String name; // Chicken name variable
	double price; //Chicken price variable
	int star; //Chicken stars variable
	/**
	 * this public can get name,price,star of chicken menus
	 * this public can set name,price,star of chicken menus
	 * 
	 * @param name
	 * this is name of chicken's menu 
	 * @param price
	 * this is price of chicken
	 * @param star
	 * this is people's star of chicken
	 */
	public Chicken(String name,double price, int star) { //chicken constructor
		this.name = name;  //name variable
		this.price = price; // price variable
		this.star = star; // star variable
	}
	public String g_name() { //get chicken name
		return name; // return this chicken name
	}
	public double g_price() { //get chicken price
		return price; //get chicken price
	}
	public int g_star() {
		return star; //get chicken's star
	}
	public void s_name(String name) { //set chicken name
		this.name= name; //set the chicken's name to new name
	}
	public void s_price(double price) { //set chicken price
		this.price = price; //set the chicken's price to new price
	}
	public void s_star(int star) {//set chicken star
		this.star = star; ////set the chicken's name to new star
	}

	/**
	 * this is main method of this program 
	 * we can get and set the chicken's name, price, stars by using constructor
	 * 
	 * At first we designate the m1,m2,m3 and we can change by using set method and print out by get method.
	 * @param args
	 * String of chicken's name
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chicken m1 = new Chicken("Original",16000.00,2); //initial set of m1
		Chicken m2 = new Chicken("Spice",17000.00,3); //initial set of m2
		Chicken m3 = new Chicken("Soy",18000.00,4); // initial set of m3

		m1.s_star(3); //set stars of m1
		m2.s_star(4); //set stars of m2
		m3.s_star(5); //set stars of m3

		m1.s_name("Crisp"); //set name of m1

		System.out.println(m1.g_name() + "'s rating is " + m1.g_star()); //print out the name and star of m1
		System.out.println(m2.g_name() + "'s rating is " + m2.g_star());//print out the name and star of m2
		System.out.println(m3.g_name() + "'s rating is " + m3.g_star());//print out the name and star of m3
	}





}
