package ru.mpei.moneyConverter;


import ru.mpei.moneyConverter.differentImpConverter.Converter;
import ru.mpei.moneyConverter.differentImpConverter.DollarConverter;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		Exchanger exchanger = new Exchanger();
		Scanner scan = new Scanner(System.in);
		Converter converter = null;
		System.out.println("This program allows you to convert money easy peasy");
		System.out.println("How much money do you have?");
		double c = scan.nextDouble();

		System.out.println("You should choose what do you need right now");
		System.out.println("---------------------------------------------------------------------------------------");
		Thread.sleep(1400);

		System.out.println("If you want to convert RUB to ... choose 1, or else you want ... to RUB choose 2");
		System.out.println("Also you need to choose currency:");
		Thread.sleep(700);
		System.out.println("1 - it's Dollar");
		Thread.sleep(700);
		System.out.println("2 - it's Yan'");
		Thread.sleep(700);
		System.out.println("3 - it's Ien");
		System.out.println("---------------------------------------------------------------------------------------");
		Thread.sleep(600);
		System.out.println("Sample: if you type 1 2 it means that you want to convert RUB to Yan'");
		System.out.println("        if you type 2 3 it means that you want to convert Ien to Rub'");


		int a = scan.nextInt();
		int b = scan.nextInt();


		if (b == 1) {
			converter = exchanger.getConverters().get(0);
		} else if (b == 2) {
			converter = exchanger.getConverters().get(1);
		} else if (b == 3) {
			converter = exchanger.getConverters().get(2);
		}


		switch (a) {
			case 1:
				exchanger.exchange(converter, true, c);
				break;
			case 2:
				exchanger.exchange(converter, false, c);
				break;

			default:
				System.out.println("Probably, you can't read. Go back to school and learn how to read and type numbers!!!!");
		}


	}


}
