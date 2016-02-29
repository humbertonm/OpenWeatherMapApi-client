package mx.com.epam.testing.training.client;

import org.springframework.web.client.RestTemplate;

import mx.com.epam.testing.training.CurrentWeather;
import mx.com.epam.testing.training.exception.CurrentWeatherException;
import mx.com.epam.testing.training.model.CurrentWeatherResponse;
import mx.com.epam.testing.training.request.OptionalParams;

public class CurrentWeatherLuisClient implements CurrentWeather {
	RestTemplate restTemplate = new RestTemplate();

	public CurrentWeatherResponse findByCityName(String cityName, String countryCode, OptionalParams optionalParams) {
		StringBuilder url = new StringBuilder(
				"http://api.openweathermap.org/data/2.5/weather?appid=44db6a862fba0b067b1930da0d769e98&q=");
		if ((cityName != null)) {
			url.append(cityName.trim());
			if ((countryCode != null) && (!"".equals(countryCode.trim()))) {
				url.append(",");
				url.append(countryCode.trim());
			}

			if (optionalParams != null) {
				if ((optionalParams.getTempUnit() != null) && (!"".equals(optionalParams.getTempUnit()))) {
					url.append("&units=");
					System.out.println(optionalParams.getTempUnit().getTempUnit());
					url.append(optionalParams.getTempUnit().getTempUnit());
				}

				if ((optionalParams.getLanguage() != null) && (!"".equals(optionalParams.getLanguage()))) {
					url.append("&lang=");
					url.append(optionalParams.getLanguage().getLanguage());
				}
			}

		}
		
		System.out.println("url: "+url);
		
		CurrentWeatherResponse response = restTemplate.getForObject(url.toString(), CurrentWeatherResponse.class);
		return response;

	}

	public CurrentWeatherResponse findByCityId(int cityId, OptionalParams optionalParams)
			throws CurrentWeatherException {
		// TODO Auto-generated method stub
		return null;
	}

}
