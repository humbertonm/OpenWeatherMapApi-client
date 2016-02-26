package mx.com.epam.testing.training.client;

import org.springframework.web.client.RestTemplate;

import mx.com.epam.testing.training.CurrentWeather;
import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.OptionalParams;

public class CurrentWeatherLuisClient implements CurrentWeather {
	public CurrentWeatherResponse findByCityName(String cityName, String countryCode, OptionalParams optionalParams) {
		String url = "http://api.openweathermap.org/data/2.5/weather?appid=44db6a862fba0b067b1930da0d769e98&units=metric&q="+cityName;
		RestTemplate restTemplate = new RestTemplate(); 
		CurrentWeatherResponse response = restTemplate.getForObject(url, CurrentWeatherResponse.class);
		return response;
	}

}
