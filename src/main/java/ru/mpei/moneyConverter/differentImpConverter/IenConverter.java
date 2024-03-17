package ru.mpei.moneyConverter.differentImpConverter;

public class IenConverter implements Converter {

	@Override
	public String toString() {
		return "IenConverter{" +
				"courseToRub=" + courseToRub +
				'}';
	}

	public double getCourseToRub() {
		return courseToRub;
	}

	private double courseToRub;

	public IenConverter(double courseToRub) {
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
		return "Ien";
	}
}
