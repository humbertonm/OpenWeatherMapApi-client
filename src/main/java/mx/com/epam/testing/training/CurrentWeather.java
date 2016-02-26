/**
 * 
 */
package mx.com.epam.testing.training;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import mx.com.epam.testing.training.exception.CurrentWeatherException;
import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.OptionalParams;

/**
 * @author Humberto_Noriega
 *
 */
public interface CurrentWeather {
	
	CurrentWeatherResponse findByCityName(String cityName, String countryCode, OptionalParams optionalParams);
	CurrentWeatherResponse findByCityId(int cityId, OptionalParams optionalParams) throws CurrentWeatherException;
}
