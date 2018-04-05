package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;
/**
 * If you input the year, this program can calculate the century 
 * @author °ÇÁØ¹ü
 *
 */
public class YearToCentury {
	int year=0;
	/**
	 * 
	 * Calculate the century 
	 * @param year
	 * year is user inputting number.
	 * @return
	 * In this following public YearCalculator if year/100 =0 then return result but not return result+1
	 * then this return number is number of century. 
	 */
	
	public int YearCalculator(int year) {
			if(year%100==0) //  year is divided by 100 and the rest is zero, like 1900,2000  
				year=year/100; // then return the rest 
			else //default
				year=year/100+1; //then return the rest+1
			return year; //return century
		}
/**
 * In the main public program use Constructor of Scanner and YearToCentury 
 * user input the number of year and then to using the YearCalculator calculate the century  		
 * @param args
 * a
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y; // int y 
		System.out.println("Input the Year:"); //print out "Input the Year"
		Scanner keyboard = new Scanner(System.in);// using the Scanner method
		y= keyboard.nextInt(); // input the number by inputted by user
		
		YearToCentury year = new YearToCentury(); //using constructor of YearToCentury
		
		System.out.println(y+" is "+year.YearCalculator(y)+"th century"); // print out century
	}

}
