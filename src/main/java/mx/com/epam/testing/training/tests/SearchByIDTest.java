package mx.com.epam.testing.training.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
	private Language language = Language.ENGLISH;
	private OptionalParams optionalParameters;
	private CurrentWeatherResponse response = new CurrentWeatherResponse();

	@BeforeClass
	public void initTests() {
		optionalParameters = new OptionalParams(mode, tempUnit, language);
	}

	// REST service response not null
	@Test (enabled = true)
	public void searchByCityIdNotNullTest() throws CurrentWeatherException {
		response = new CurrentWeatherDanteClient().findByCityId(cityId, optionalParameters);
		Assert.assertNotNull(response);
	}

	// response is in JSON format
	@Test (enabled = false)
	public void searchByCityIdCheckModeJson() throws CurrentWeatherException {
		CurrentWeatherDanteClient danteCient = new CurrentWeatherDanteClient();
		response = danteCient.findByCityId(cityId, optionalParameters);
		String output = danteCient.getOutputString();
		Assert.assertTrue(CurrentWeatherDanteClient.checkJsonFormat(output, optionalParameters));

	}
	
}
