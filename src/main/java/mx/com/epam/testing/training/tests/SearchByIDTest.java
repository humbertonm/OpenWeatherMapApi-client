package mx.com.epam.testing.training.tests;

import org.testng.annotations.Test;
import mx.com.epam.testing.training.client.CurrentWeatherDanteClient;
import mx.com.epam.testing.training.exception.CurrentWeatherException;

public class SearchByIDTest {
	private int cityId = 2172797;
	private String mode = "json";
	private String tempUnit = "metric";
	@Test
	  public void searchByCityIDTest() {
		
		try{
		 new CurrentWeatherDanteClient().findByCityId(cityId, null);
		}
		catch(CurrentWeatherException e){
			e.printStackTrace();
		}
	}
}
