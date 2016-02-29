package mx.com.epam.testing.training.request;

public enum TempUnit {
	METRIC("metric"), IMPERIAL("imperial"), STANDARD("");

	private String tempString;

	TempUnit(String tempString) {
		this.tempString = tempString;
	}

	public String getTempString() {
		return tempString;
	}
}
