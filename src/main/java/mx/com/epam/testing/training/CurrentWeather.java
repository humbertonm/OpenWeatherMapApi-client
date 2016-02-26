/**
 * 
 */
package mx.com.epam.testing.training;

import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.OptionalParams;

/**
 * @author Humberto_Noriega
 *
 */
public interface CurrentWeather {
	
	CurrentWeatherResponse findByCityName(String cityName, String countryCode, OptionalParams optionalParams);

}
