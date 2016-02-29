package mx.com.epam.testing.training.request;

public enum TempUnit {
<<<<<<< HEAD
 METRIC("metric"), IMPERIAL("imperial");
	
	String tempUnit;
	
	TempUnit(String tempUnit){
		this.tempUnit = tempUnit;
	}
	
	public String getTempUnit() {
		return tempUnit;
=======
	METRIC("metric"), IMPERIAL("imperial"), STANDARD("");

	private String tempString;

	TempUnit(String tempString) {
		this.tempString = tempString;
	}

	public String getTempString() {
		return tempString;
>>>>>>> b381a7f950df5fd0625aad2fd8c7726f1bce238f
	}
}
