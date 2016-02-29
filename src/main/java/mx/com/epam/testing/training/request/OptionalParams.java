/**
 * 
 */
package mx.com.epam.testing.training.request;

/**
 * @author Humberto_Noriega
 *
 */
public class OptionalParams {
	private Mode mode;
	private Language language;
	private TempUnit tempUnit;
	
	public OptionalParams(Mode mode, TempUnit tempUnit, Language language){
		this.mode=mode;
		this.language= language;
		this.tempUnit=tempUnit;
	}
	
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
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
