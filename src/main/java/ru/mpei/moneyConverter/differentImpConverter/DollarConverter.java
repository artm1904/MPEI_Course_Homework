package ru.mpei.moneyConverter.differentImpConverter;

public class DollarConverter implements Converter{
	@Override
	public String toString() {
		return "DollarConverter{" +
				"courseToRub=" + courseToRub +
				'}';
	}

	public double getCourseToRub() {
		return courseToRub;
	}

	private double courseToRub;

	public DollarConverter(double courseToRub) {
		this.courseToRub = courseToRub;
	}

	@Override
	public double convertToRub(double ue) {
		return ue*courseToRub;
	}

	@Override
	public double convertToCurrency(double rub) {

		return rub/courseToRub;
	}

	@Override
	public String getType() {

		return "Dollar";
	}
}

