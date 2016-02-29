package mx.com.epam.testing.training.request;

public enum Language {
	EN_US("en_us");
	private String languageString;

	Language(String languageSent) {
		this.languageString = languageSent;
	}

	public String getLanguageString() {
		return languageString;
	}
}
