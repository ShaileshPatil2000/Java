package Lab15_16;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Cal15{
	
	LocalDate date;
	LocalTime time;
	int Calender;
	
	public Cal15() {
		super();
	}
     
	public Cal15(LocalDate date, LocalTime time, int calender) {
		super();
		this.date = date;
		this.time = time;
		Calender = calender;
	}




	public static void main(String[] args) {
		Date d=new Date();
		Cal15 ob=new Cal15();
		

	}

}
