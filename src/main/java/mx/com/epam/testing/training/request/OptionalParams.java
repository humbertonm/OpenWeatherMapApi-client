/**
 * 
 */
package mx.com.epam.testing.training.request;

/**
 * @author Humberto_Noriega
 *
 */
public class OptionalParams {
	private String mode;
	private Language language;
	private TempUnit tempUnit;
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public TempUnit getTempUnit() {
		return tempUnit;
	}
	public void setTempUnit(TempUnit tempUnit) {
		this.tempUnit = tempUnit;
	}
}
