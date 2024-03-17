package ru.mpei.moneyConverter.differentImpConverter;

public interface Converter {
	double convertToRub(double ue);
	double convertToCurrency(double rub);
	String getType();

}
