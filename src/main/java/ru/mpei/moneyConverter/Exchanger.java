package ru.mpei.moneyConverter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import ru.mpei.moneyConverter.differentImpConverter.Converter;
import ru.mpei.moneyConverter.differentImpConverter.DollarConverter;
import ru.mpei.moneyConverter.differentImpConverter.IenConverter;
import ru.mpei.moneyConverter.differentImpConverter.YanConverter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.util.*;

public class Exchanger {

	private  List<Converter> converters = new ArrayList<>();

	public  List<Converter> getConverters() {
		return converters;
	}

	public Exchanger() throws IOException {
		String url = "https://www.finmarket.ru/currency/rates/";
		Document page = Jsoup.parse(new URL(url), 3000);
		Elements table = page.select("table[class=karramba]");
		DollarConverter dollarConverter = new DollarConverter(getCurseFromSite(table, 13));
		YanConverter yanConverter = new YanConverter(getCurseFromSite(table, 22));
		IenConverter ienConverter = new IenConverter(getCurseFromSite(table, 42));

		converters.add(dollarConverter);
		converters.add(yanConverter);
		converters.add(ienConverter);
	}


	static double getCurseFromSite(Elements table, int number) {
		Element real = table.select("tr[class]").get(number);
		Element course = real.select("td").get(3);
		double crs = Double.parseDouble((course.text()).replace(",", "."));
		return crs;
	}


	public void exchange(Converter converter, boolean process, double value){

		if (process==true){
			double v = converter.convertToCurrency(value);
			System.out.println(value +" RUB today is equal "+ v+" " + converter.getType());
		}

		if (process==false){
			double v = converter.convertToRub(value);
			System.out.println(value +" "+ converter.getType() +" today is equal "+ v+ " RUB");
		}




	}

}
