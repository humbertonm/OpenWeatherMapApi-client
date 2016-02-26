package mx.com.epam.testing.training.client;

import org.testng.Assert;
import org.testng.annotations.Test;

import mx.com.epam.testing.training.model.CurrentWeatherResponse;

public class CurrentWeatherLuisClientTest {

	@Test
	public void verifyResponseWhenCityIsValid(){
		// defitnition
		CurrentWeatherLuisClient client = new CurrentWeatherLuisClient();
		String validCityName = "Guadalajara"; 
		
		// execution
		CurrentWeatherResponse response = client.findByCityName(validCityName, null, null);
	
		
		//validation
		//Assert.assertEquals(actual, expected);
		
	}
}
