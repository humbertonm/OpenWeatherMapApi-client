package mx.com.epam.testing.training.request;

public enum Mode {
	XML("xml"), JSON(""), HTML("html");

	private String modeString;

	Mode(String modeString) {
		this.modeString = modeString;
	}

	public String getModeString() {
		return modeString;
	}
}
