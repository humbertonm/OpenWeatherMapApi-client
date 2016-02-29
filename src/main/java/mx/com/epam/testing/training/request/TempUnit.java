package mx.com.epam.testing.training.request;

public enum TempUnit {
 METRIC("metric"), IMPERIAL("imperial");
	
	String tempUnit;
	
	TempUnit(String tempUnit){
		this.tempUnit = tempUnit;
	}
	
	public String getTempUnit() {
		return tempUnit;
	}
}
