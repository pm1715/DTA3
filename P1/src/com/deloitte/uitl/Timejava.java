package com.deloitte.uitl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Timejava {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println(today);

		LocalDate yesterday= today.minusDays(1);
		System.out.println(yesterday);

		LocalDate tomm= today.plusDays(1);
		System.out.println(tomm);

		LocalDate specific= LocalDate.of(2024, 5, 23);
		System.out.println(specific);

		LocalTime timenow= LocalTime.now();
		System.out.println(timenow);


		LocalTime time1= timenow.plusHours(1);
		System.out.println(time1);

		LocalTime time2= timenow.minusHours(1);
		System.out.println(time2);

		LocalTime time3= LocalTime.of(20, 45);
		System.out.println(time3);


		LocalDateTime present= LocalDateTime.now();
		System.out.println(present);

		LocalDateTime prev= present.minusDays(1);
		System.out.println(prev);

		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yy/MM//dd HH:mm:ss");
		String formatdate=present.format(formatter);
		System.out.println(formatdate);		


	}
}
