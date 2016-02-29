package mx.com.epam.testing.training.client;

import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.Language;
import mx.com.epam.testing.training.request.OptionalParams;
import mx.com.epam.testing.training.request.TempUnit;

public class CurrentWeatherLuisClientTest {

	@Test
	public void verifyResponseWhenCityIsValid(){
		// defitnition
		CurrentWeatherLuisClient client = new CurrentWeatherLuisClient();
		String validCityName = "Guadalajara"; 
		
		// execution
		CurrentWeatherResponse response = client.findByCityName(validCityName, null, null);
	
		
		//validation
		Assert.assertEquals(response.getName(),"Guadalajara");
		Assert.assertEquals(response.getCod(), new Integer(200));
		
	}
	
	
	@Test
	public void verifyResponseWhenCityAndCountryCodeAreValid(){
		CurrentWeatherLuisClient client = new CurrentWeatherLuisClient();
		String validCityName = "Guadalajara"; 
		String CountryCode = "mxn";
		CurrentWeatherResponse response = client.findByCityName(validCityName,CountryCode, null);
		Assert.assertEquals(response.getCod(),new Integer(200));
	}
	
	
	@DataProvider (name = "languages")
	public Object[][] languagesMatrix(){
		return new Object[][]{
			{Language.ENGLISH, "clear sky"},
			{Language.SPANISH, "cielo claro"},
			{Language.SPANISH2, "cielo claro"}
			
	 };
		
	}
	@Test(dataProvider = "languages")
	public void verifyAvailabelLanguages(Language language, String expectedDesc){
		
		CurrentWeatherLuisClient client = new CurrentWeatherLuisClient();
		OptionalParams optionalParams = new OptionalParams();
		optionalParams.setLanguage(language);
		CurrentWeatherResponse response = client.findByCityName("Guadalajara","mxn", optionalParams);
		System.out.println(response);
		
		Assert.assertEquals(response.getWeather().get(0).getDescription(), expectedDesc);
		
	}
	
	
	@DataProvider (name = "tempunits")
	public Object[][] tempUnitMatrix(){
		return new Object[][]{
			{TempUnit.IMPERIAL,76.9},
			{TempUnit.METRIC,24.94},
		};
	
	}
	
	
	@Test (dataProvider = "tempunits")
	public void verifyAvailabelTempUnit(TempUnit tempUnit, double expectedDesc){
		CurrentWeatherLuisClient client = new CurrentWeatherLuisClient();
		OptionalParams optionalParams = new OptionalParams();
		optionalParams.setTempUnit(tempUnit);
		CurrentWeatherResponse response = client.findByCityName("Guadalajara","mxn", optionalParams);
	    System.out.println(response);
	    Assert.assertEquals(response.getMain().getTemp(),expectedDesc);
	}
	
	
	
	
	/*
	
	@DataProvider(name = "dataProviderExample")
	public Object[][] dataProviderExample(){
		
		return new Object[][]{  
			{0,0,"l",0},
			{1,1,"hola",1},
			{5,9,"adios",7}
		};
	}
	
	@Test(dataProvider ="dataProviderExample")
	public void example(int a, int b, String c, int d){
		System.out.println("a: "+a+", b: "+b+", c:"+c+", d:"+d);
	}
	
	*/
}
