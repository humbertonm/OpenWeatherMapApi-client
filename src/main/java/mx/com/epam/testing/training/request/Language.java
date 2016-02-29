package mx.com.epam.testing.training.request;

public enum Language {

	ENGLISH("en"),RUSSIAN("ru"),ITALIAN("it"),SPANISH("es"),SPANISH2("sp"),UKRANIAN ("uk"),UKRANIAN2("ua"),GERMAN("de"),PORTUGUESE("pt"),ROMANIAN("ro"),POLISH("pl"),FINISH ("fi"),DUTCH("nl"), FRENCH("fr"),BULGARIAN("bg"),SWEDISH ("sv"),CHINESE("zh_tw"),TURKISH("tr"),Croatian("hr"),CATALAN("ca");
	
	String language;
	Language(String language){
		this.language = language;
	}
		
	public String getLanguage() {
		return language;
	}
}
