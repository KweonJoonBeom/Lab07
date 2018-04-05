package edu.handong.csee.java.lab07.prob3;
import java.util.Scanner;
import java.util.Random; //import Random constructor
/**
 * This is Attendance of class 
 * this program can determine whether students are fail or not
 * input the student name, grade, num and absent ,then print out fail or not
 * this program designate the absent numbers to student who are inputted by random method 
 * @author °ÇÁØ¹ü
 *
 *
 */
public class Attendance {
	private String name; //variable name
	int grade; // variable grade 
	int num; // variable student id
	int absent; //variable student's absent number
	/**
	 * define constructors(Attendance, getter,setter) 
	 * @param name
	 * number is student name
	 * @param grade
	 * grade is student's grade
	 * @param num
	 * num is stduents id 
	 * @param absent
	 * absent is student's absent number
	 */
	public Attendance(String name, int grade, int num, int absent) //define constructor of students information 
	{
		this.name = name; //student name 
		this.grade = grade; //student grade
		this.num = num; //student id
		this.absent = absent; //student absent
	}

	public String g_name() //get student name
	{
		return name; //return the name
	}
	public int g_grade() //get student grade
	{
		return grade; //return the grade
	}

	public int g_num() //get student id
	{
		return num; //return the id
	}
	public int g_absent() //get student absent numbers
	{
		return absent; //return
	}

	public void s_name(String name) //set student name
	{
		this.name = name; //setting name
	}
	public void s_grade(int grade) //set student grade
	{
		this.grade = grade; //seting grade
	}
	public void s_num(int num) //set student id
	{
		this.num = num; //setting student id
	}
	public void s_absent(int absent) //set absent number
	{
		this.absent = absent; //setting number
	}

	/**
	 * This is main method of Attendance 
	 * After first set of student information, program set the absent number by using random method 
	 * if absent number is more than 6 , then print out fail message in this course or not print out student grade.
	 *   
	 * @param args
	 * student Name
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance s1 = new Attendance("Jess",4,21400999,0); //initial set of s1
		Attendance s2 = new Attendance("Kent",2,21700111,0); //initial set of s2
		Attendance s3 = new Attendance("Lucas", 1, 21833222, 0);//initial set of s3
		Attendance s4 = new Attendance("Martha", 2,21733444, 0);//initial set of s4

		Random rd = new Random(); //using random constructor
		s1.s_absent(rd.nextInt(10)); // designate random number(1~10) to s1
		s2.s_absent(rd.nextInt(10));//designate random number(1~10) to s2
		s3.s_absent(rd.nextInt(10));//designate random number(1~10) to s3
		s4.s_absent(rd.nextInt(10));//designate random number(1~10) to s4

		if(s1.g_absent() > 6) //if absents of s1 are more than 6 
		{
			System.out.println("I'm sorry " + s1.g_name() + ". You fail this course"); //print out fail
			System.out.println(s1.g_name() + " - Number of absence: " + s1.g_absent()); //print out absence num
		}
		else //default
			System.out.println("We'll see about the grade, " + s1.g_name()); // print out name

		if(s2.g_absent() > 6) //if absents of s2 are more than 6 
		{
			System.out.println("I'm sorry " + s2.g_name() + ". You fail this course"); //print out fail
			System.out.println(s2.g_name() + " - Number of absence: " + s2.g_absent()); //print out absence num
		}
		else //default
			System.out.println("We'll see about the grade, " + s2.g_name()); // print out name

		if(s3.g_absent() > 6) //if absents of s3 are more than 6 
		{
			System.out.println("I'm sorry " + s3.g_name() + ". You fail this course"); //print out fail
			System.out.println(s3.g_name() + " - Number of absence: " + s3.g_absent()); //print out absence num
		}
		else //default
			System.out.println("We'll see about the grade, " + s3.g_name()); // print out name

		if(s4.g_absent() > 6) //if absents of s4 are more than 6 
		{
			System.out.println("I'm sorry " + s4.g_name() + ". You fail this course"); //print out fail
			System.out.println(s4.g_name() + " - Number of absence: " + s4.g_absent()); //print out absence num
		}
		else //default
			System.out.println("We'll see about the grade, " + s4.g_name()); // print out name

	}


}
