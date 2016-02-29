package mx.com.epam.testing.training.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import mx.com.epam.testing.training.client.CurrentWeatherDanteClient;
import mx.com.epam.testing.training.exception.CurrentWeatherException;
import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.Language;
import mx.com.epam.testing.training.request.Mode;
import mx.com.epam.testing.training.request.OptionalParams;
import mx.com.epam.testing.training.request.TempUnit;

import org.testng.Assert;

public class SearchByIDTest {
	private int cityId = 2172797;
	private Mode mode = Mode.JSON;
	private TempUnit tempUnit = TempUnit.METRIC;
	private Language language = Language.EN_US;
	private OptionalParams optionalParameters;

	@BeforeClass
	public void initTests() {
		optionalParameters = new OptionalParams(mode, tempUnit, language);
	}

	// REST service responenot null
	@Test
	public void searchByCityIdNotNullTest() throws CurrentWeatherException {
		CurrentWeatherResponse response;
		response = new CurrentWeatherDanteClient().findByCityId(cityId, optionalParameters);
		Assert.assertNotNull(response);
		System.out.println("MAXoutside: " + response.getMain().getTempMax());
	}

	// Checks if response is in JSON format
	@Test (enabled = false)
	public void searchByCityIdCheckModeJson() throws CurrentWeatherException {
		CurrentWeatherResponse response;
		response = new CurrentWeatherDanteClient().findByCityId(cityId, optionalParameters);
		Assert.assertNotNull(response);

	}
	
	// Checks if response temeprature is in Kelvin degrees
	@Test (enabled = false)
	public void searchByCityIdCheckTempKelvin() throws CurrentWeatherException {
		CurrentWeatherResponse response;
		response = new CurrentWeatherDanteClient().findByCityId(cityId, optionalParameters);
		Assert.assertTrue(true);
	}
}
